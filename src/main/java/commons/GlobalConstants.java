package commons;

import com.github.javafaker.Faker;
import java.util.Locale;

public class GlobalConstants {

    public static final String SAMPLE_GMAIL_ADDRESS = "vunguyen";
    public static final String SAMPLE_GMAIL_PASSWORD = "12345";
    public static final String SAMPLE_RECIPIENT_EMAIL_ADDRESS = "vunguyen.automationtester@gmail.com";
    public static final String SAMPLE_EMAIL_SUBJECT_CONTENT = new Faker(new Locale("en_EN")).company().name();
    public static final String SAMPLE_EMAIL_CONTENT = new Faker(new Locale("en_EN")).gameOfThrones().character();
    public static final long SHORT_TIMEOUT = 5;
    public static final long LONG_TIMEOUT = 10;

}
