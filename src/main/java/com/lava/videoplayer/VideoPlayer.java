package com.lava.videoplayer;

import com.lava.utils.Base;
import org.openqa.selenium.ElementNotVisibleException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

/**
 * Created by codecraft on 25/09/16.
 */
public class VideoPlayer extends Base {

    @FindBy(xpath="//div[@id='player-container']")
    @CacheLookup
    private static WebElement videoPlayer;

    @FindBy(xpath="//div[@class='volumeBar']")
    @CacheLookup
    private static WebElement videoVolumeButton;

    @FindBy(xpath="//div[@id='floatingCirclesG']")
    @CacheLookup
    private static  WebElement videoLoadingIndicator;

    @FindBy(xpath="//div[@class='video-fullscreen']")
    @CacheLookup
    private static WebElement videoFullScreenToggle;

    @FindBy(xpath="//span[@class='duration']")
    @CacheLookup
    private static WebElement totalVideoDuration;

    @FindBy(xpath="//span[@class='current']")
    @CacheLookup
    private static WebElement currentVideoDuration;

    @FindBy(xpath="//div[@id='draggable2']")
    @CacheLookup
    private static WebElement videoSliderDraggable;

    @FindBy(xpath="//span[@class='timeBar']")
    @CacheLookup
    private WebElement videoSliderTimebar;

    @FindBy(xpath = "//div[@class='video-back-button']")
    @CacheLookup
    private WebElement videoCloseButton;

    @FindBy(xpath="//div[@class='subtitles']")
    @CacheLookup
    private WebElement subtitlesButton;

    @FindBy(xpath = "//li[contains(@class,'eng')]")
    @CacheLookup
    private WebElement englishMenu;

    @FindBy(xpath = "//li[contains(@class,'esp')]")
    @CacheLookup
    private WebElement spanishMenu;

    @FindBy(xpath = "//li[contains(@class,'off')]")
    @CacheLookup
    private WebElement offMenu;



    public static boolean isVideoPlayerVisible(){
        waitUntilElementIsVisible(videoPlayer);
        return isElementVisible(videoPlayer);
    }

    public void waitUntilVideoStartsPlaying(){
        if(isVideoPlayerVisible()){
            waitForElementToBeInvisible(videoLoadingIndicator);
        }
    }

    public void waitUntilVideoPlayerCloses(){
        waitForElementToBeInvisible(videoPlayer);
    }

    public boolean isVideoPlaying(){
        return !isElementVisible(videoLoadingIndicator);
    }

    public void clickVideoPlayerVolumeButton(){

        mouseHoverAndClickElement(videoPlayer,videoVolumeButton);
    }

    // Incomplete
    public void isFullScreen(){
        String winHandleBefore = driver.getTitle();
        //driver.get
        System.out.println(winHandleBefore);
        mouseHoverAndClickElement(videoPlayer,videoFullScreenToggle);
        sleep(10);
        String winHandleBefore1 = driver.getTitle();
        System.out.println(winHandleBefore1);

    }

    public  String getTotalVideoLengthFromVideoPlayer() throws ElementNotVisibleException {
        String videoLength = new String();
        if(isElementVisible(videoPlayer)){
            mouseHoverOnElement(videoPlayer);
            if(isElementVisible(totalVideoDuration)){
                videoLength= totalVideoDuration.getText();
            }
            else{
                throw new ElementNotVisibleException("Total Duration Was Not displayed");
            }

        }
        else{
            throw new ElementNotVisibleException("Video Player Not Found");
        }
        return videoLength;
    }

    public String getcurrentVideoLengthFromVideoPlayer(){
        String currentVideoLength = new String();
        if(isElementVisible(videoPlayer)){
            for (int i=0;;i++){
                try {
                    mouseHoverOnElement(videoPlayer);
                    currentVideoLength= currentVideoDuration.getText();
                    break;
                }catch (ElementNotVisibleException e){
                    if (i < 3) {
                        continue;
                    } else {
                        throw e;
                    }
                }

            }
        }
        else{
            throw new ElementNotVisibleException("Video Player Not Found");
        }
        return currentVideoLength;
    }

    public String changeVideoPlayerTime(int value){
        //slideThroughSlider(videoSlider,value);
        int i=5;
        while (getCurrentPercentageOfVideoPlayed()!=value){
            //mouseHoverOnElement(videoPlayer);
            slideThroughSlider(videoSliderTimebar,i);
            i+=5;
        }

        return getcurrentVideoLengthFromVideoPlayer();
    }

    public int getCurrentPercentageOfVideoPlayed(){
        int currentPercentage = 0;
        if(isElementVisible(videoPlayer)){
            for (int i = 0;; i++) {
                try{
                    mouseHoverOnElement(videoPlayer);
                    if(isElementVisible(videoSliderDraggable)){
                        String percentage= videoSliderDraggable.getAttribute("style").split("left: ")[1];
                        double percentageInDouble= Double.parseDouble(percentage.split("%")[0]);
                        currentPercentage = (int) percentageInDouble;
                        System.out.println(currentPercentage);
                        break;
                    }
                }
                catch(ElementNotVisibleException e) {
                    if (i < 3) {
                        continue;
                    } else {
                        throw e;
                    }
                }
            }
        }
        else{
            throw new ElementNotVisibleException("Video Player Not Found");
        }
        return currentPercentage;
    }

    public void closeVideoPlayer(){
        mouseHoverAndClickElement(videoPlayer,videoCloseButton);
        waitForElementToBeInvisible(videoPlayer);
    }
}
