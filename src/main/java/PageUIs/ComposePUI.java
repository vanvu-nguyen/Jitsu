package PageUIs;

public class ComposePUI {
    public static final String COMPOSE_BUTTON = "XPATH=//div[@role='button' and text()='Compose']";
    public static final String RECIPIENT_TEXTBOX = "XPATH=//input[@aria-label='To recipients']";
    public static final String SUBJECT_TEXTBOX = "XPATH=//input[@name='subjectbox']";
    public static final String MESSAGE_BODY_TEXTBOX = "XPATH=//div[@aria-label='Message Body']";
    public static final String SEND_EMAIL_BUTTON = "XPATH=//div[contains(text(),'Send') and contains(@data-tooltip,'Send')]";
    public static final String MESSAGE_SENT_TOAST = "XPATH=//div[@aria-live='assertive' and @role='alert']//span[text()='Message sent']";
    public static final String UNDO_BUTTON_ON_TOAST = "XPATH//div[@aria-live='assertive' and @role='alert']//span[text()='Undo']";
    public static final String SENT_SIDEBAR_MENU = "XPATH=//div[@data-tooltip='Sent']//a[@aria-label='Sent']";
    public static final String DYNAMIC_SENT_EMAIL_RECORD_WITH_SUBJECT = "XPATH=//div[@role='main']//tr[@role='row']/td[5]//span[text()='%s']";
    public static final String SENT_EMAIL_DETAIL_RECIPIENT = "XPATH=//div[@role='listitem'][1]//span[text()='to ']/span";
    public static final String DYNAMIC_SENT_EMAIL_DETAIL_WITH_SUBJECT = "XPATH=//h2[text()='%s']";
    public static final String DYNAMIC_SENT_EMAIL_DETAIL_WITH_MESSAGE_BODY = "XPATH=//div[text()='%s']";

}

