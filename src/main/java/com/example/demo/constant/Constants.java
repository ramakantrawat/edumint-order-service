package com.example.demo.constant;

public class Constants {

    public static final String APP_NAME = "EduMint";
    public static final String DESC = "DESC";
    public static final String ACTIVE = "ACTIVE";
    public static final String UTC = "UTC";
    public static final String UTF = "UTF-8";
    public static final String CURRENCY_TYPE = "usd";
    public static final String SUBSCRIBED_USER = "subscribedUser";

    public static final String THUMB = "_small_image";
    public static final String LARGE_THUMB = "_large_image";
    public static final String THUMB_FILE_EXT = "png";

    public static final int[] THUMB_WIDTH_HEIGHT = {100, 100};

    public static final long RECEIPT_EXPIRE_GRACE = 15;
    public static final String SUCCESS = "Success";

    public static final double ZERO = 0;
    public static final String VIP_SIGN_UP = "VIP Signup";
    public static final String CELEB_NAME = "celebName";
    public static final String USER_NAME = "userName";
    public static final String TO_USER_NAME = "toUser.name";
    public static final String FROM_USER_NAME = "fromUser.name";
    public static final String CATEGORY = "category";
    public static final String PROFESSION = "profession";

    private Constants() {
        // private constructor
    }


    public static final String S3_PATH_SEPARATOR = "/";
    public static final String FILE_EXT_SEPARATOR = ".";

    public static final String HTTPS = "https://";

    public static final long UPLOAD_MEDIA_URL_VALIDITY = 1000 * 60 * 60 * 6L; //6 hours

    public static final int DEFAULT_PAGE_SIZE = 10;

    public static final int DEFAULT_PAGE_NUMBER = 0;

    public static final String LIKE_OPERATOR = "%";
    public static final int TEXT_MSG_CHAR_LIMIT = 500;

    public static final int PROFILE_POSTS_PAGE_NUMBER = 0;
    public static final int PROFILE_POSTS_PAGE_SIZE = 3;

    public static final String ROLE = "ROLE_";

    public static final String CREATION_DATE = "creationDate";

    public static final String ACCOUNT_VERIFY = "templates/account-verification-email.html";

    public static final String INVITE_FRIENDS = "templates/invite-friend-email.html";

    public static final String PASS = "templates/reset-password-email.html";

    public static final String VIP_CODE_VERIFICATION = "templates/vip-code-verification-email.html";

    public static final String VERIFICATION_ADV = "templates/adv-verification.html";

    public static final String INVITE_EVENT_MANAGER = "templates/event-manager-verification-email.html";

    public static final String SUPPORT_RESPONSE = "templates/query-resolved-email.html";

    public static final String CONCERN_WARNING = "templates/concern-warning-email.html";

    public static final String REJECT_PROMOTION_REQUEST = "templates/reject-advertisement-request.html";

    public static final String ACCEPTED_PROMOTION_REQUEST = "templates/accept-advertisement-request.html";

    public static final String ADVERTISEMENT_REQUEST_TO_CELEBRITY = "templates/advertisement-request-celebrity.html";

    public static final String CANCEL_PROMOTION_REQUEST = "templates/cancel-advertisement-request.html";

    public static final String DEVICE_TYPE_ANDROID = "Android";

    public static final String CONNECT = "CONNECT";

    public static final int BATCH_PAGE_SIZE = 200;
    public static final int FIRST_PAGE = 0;

    public static class StripeConstant {

        private StripeConstant() {
        }

        public static final String REQUIRES_CAPTURE = "requires_capture";
        public static final String SUCCEEDED = "succeeded";
    }

    public static class PayoutEarningSourceConstant {

        private PayoutEarningSourceConstant() {
        }

        public static final String PROMOTION = "PROMOTION";
        public static final String TEXT = "TEXT";
        public static final String VIDEO = "VIDEO";
        public static final String PAID = "PAID";
        public static final String ADJUSTMENT = "ADJUSTMENT";
        public static final String AUDIO = "AUDIO";
        public static final String EVENT = "EVENT";
    }

    public static class ProfileSubscriptionErrorCode {
        public static final String NO_PRODUCT_AVAILABLE = "600";
        public static final String NOT_ELIGIBLE = "601";
        public static final String ALREADY_SUBSCRIBED = "602";
        public static final String MAX_SUBSCRIPTION_LIMIT_REACHED = "603";
        public static final String LIMIT_EXCEEDED = "604";

        private ProfileSubscriptionErrorCode(){}

    }
}
