package com.example.demo.constant;

public class RestMappingConstant {

    public static final String LIST = "/list";
    public static final String UPDATE = "/update";
    public static final String ID = "/{id}";
    public static final String RESEND_EMAIL = "/resend/email";
    public static final String ADMIN = "/admin";
    public static final String PROMOTION = "/promotion";

    public static class OrderConstant{
        private OrderConstant() {}
        public static final String ORDER = "/order";
        public static final String ORDER_URL = BASE_URL + ORDER;

    }





//
    private RestMappingConstant() {
    }

    public static final String BASE_URL = "/api/v1";

    public static class AuthConstant {

        public static final String ADVERTISEMENT_SIGN_UP = "/adv-signup";


        private AuthConstant() {
        }

        public static final String AUTH_URL = BASE_URL + "/auth";

        public static final String EMAIL_SIGNUP = "/email-signup";

        public static final String VERIFY_OTP = "/verify-otp";

        public static final String RESEND_OTP = "/resend-otp";

        public static final String LOGIN = "/login";

        public static final String LOGIN_CODE = "/login/code";

        public static final String SOCIAL_CONNECT = "/social/connect";

        public static final String S3_UPLOAD_URL = "/s3-upload-url";
    }

    public static class UserConstant {

        public static final String USER = "/user";
        public static final String BLOCK_USER_URL = "/block";

        private UserConstant() {
        }

        public static final String USER_URL = BASE_URL + USER;

        public static final String USER_INVITE = USER_URL + "/invite";

        public static final String UPDATE_PROFILE = "/{userId}/update";

        public static final String USER_PROFILE_URL = "/{userId}";

        public static final String ACCESS_TOKEN = "/{userId}/access-token";

        public static final String ADD_EMAIL = "/add-email";

        public static final String CHANGE_PASSWORD = "/change-password";

        public static final String SEARCH = "/search";

        public static final String LOGOUT = "/logout";

        public static final String SOCIAL_ACCOUNTS = "/socialAccounts/{userId}";

        public static final String REMOVE_SOCIAL_ACCOUNTS = "/remove/socialAccounts/{userId}/{code}";

        public static final String OTHER_USER_PROFILE_URL = "profile/{userId}";

        public static final String CREATE_UPDATE_ES_DATA_URL = "/elasticsearch-data";
    }

    public static class InterestConstant {

        public static final String UPDATE = "/update";

        private InterestConstant() {
            //no need to implement, private constructor
        }

        public static final String INTEREST_LIST = "list";
        public static final String DELETE = "/delete/{interestId}";
        public static final String ADD = "/add";
        public static final String EDIT = "/edit";
        public static final String INTEREST_URL = BASE_URL + "/interest";
    }

    public static class MediaConstant {

        private MediaConstant() {
            //no need to implement, private constructor
        }

        public static final String MEDIA_URL = BASE_URL + "/media";

        public static final String GET_UPLOAD_URL = "/upload/{userId}";

        public static final String GET_MEDIA_URL = "/{userId}/{mediaId}";
    }

    public static class PromotionReqConstant {


        private PromotionReqConstant() {
        }

        public static final String PROMOTION_REQUEST_BASE_URL = BASE_URL + "/promotion/request";
        public static final String GET_PROMOTIONS = "/list/{userId}";
        public static final String GET_PROMOTION_REQUEST = "/{promotionRequestId}/{userId}";
        public static final String STATUS = "status";

    }


    public static class ConnectRequestConstant {

        private ConnectRequestConstant() {
            //no need to implement, private constructor
        }

        public static final String CONNECT_URL = BASE_URL + "/connect";

        public static final String CONNECT_TO_CELEBS_URL = "/connect-to-celeb/{userId}";

        public static final String GET_CONNECT_LIST_URL = "/requests/{userId}";

        public static final String CELEB_REPLY_URL = "/celeb-reply/{userId}";

        public static final String GET_A_CONNECT_REQUEST_URL = "/{connectId}/{userId}";

        public static final String CONNECT_DISPUTE_URL = "/disputes/{userId}";

        public static final String PUBLIC_CONNECT_URL = "/public";

        public static final String PUBLIC_CONNECT_USERS_URL = "/users";
    }

    public static class PostConstant {

        private PostConstant() {
            //no need to implement, private constructor
        }

        public static final String POST_URL = BASE_URL + "/post";

        public static final String CREATE_POST_URL = "/{userId}";

        public static final String ALTER_POST = "/{postId}/{userId}";

        public static final String GET_POST_URL = "/{postId}/{userId}";

        public static final String GET_CELEB_POSTS = "/my-posts/{celebId}/{userId}";

        public static final String MARK_INTERESTED = "/mark-interested/{postId}/{userId}";
    }

    public static class ConcernConstant {

        private ConcernConstant() {
            //no need to implement, private constructor
        }


        public static final String CONCERN_URL = BASE_URL + "/concern";
        public static final String WARN = "/warn";
        public static final String RAISE_CONCERN_URL = "/{userId}";
    }

    public static class UserBlockConstant {

        private UserBlockConstant() {
        }

        public static final String USER_BLOCK_URL = BASE_URL + "/block";

        public static final String BLOCK_USER = "/{userId}/{blockUserId}";

        public static final String BLOCK_USER_LIST = "/list/{userId}";

    }

    public static class PromotionConstant {


        private PromotionConstant() {
        }

        public static final String REQUEST = "/request";
        public static final String PROMOTION_ID = "/{id}";
        public static final String PROMOTION_BASE_URL = BASE_URL + PROMOTION;
        public static final String GET_PROMOTION = "/{id}";
        public static final String PROMOTION_ADD = "add";
        public static final String SEARCH = "search";
        public static final String AD_VIEW_REWARD = "/view-ad-reward/{userId}/{promotionRequestId}";
    }

    public static class ProductsConstant {

        private ProductsConstant() {
        }

        public static final String PRODUCTS_BASE_URL = BASE_URL + "/product";
        public static final String PRODUCT = "/{id}";

    }

    public static class UpgradeAccountConstant {

        private UpgradeAccountConstant() {
            //private constructor
        }

        public static final String UPGRADE_ACCOUNT_URL = "/upgrade-account/{userId}";
    }

    public static class NotificationConstant {

        private NotificationConstant() {
        }

        public static final String NOTIFICATION_URL = BASE_URL + "/notification";
        public static final String UNREAD = "/unread-notification/{userId}";
    }

    public static class LiveConstant {

        private LiveConstant() {
            //private constructor
        }


        public static final String LIVE_URL = BASE_URL + "/live";

        public static final String REQUEST_GO_LIVE_URL = "/{userId}";

        public static final String LIVE_STATUS_URL = "/status/{userId}";

        public static final String START_STREAM_URL = "/start-stream/{userId}";

        public static final String JOIN_STREAM_URL = "/join-stream/{userId}/{celebEventId}";

        public static final String VIEWER_COUNT_URL = "/viewer-count/{userId}/{celebId}";

        public static final String ALL_LIVE_EVENTS_URL = "/all-live-event";

        public static final String END_STREAM_URL = "/end-stream/{userId}";

    }

    public static class CreditConstant {

        private CreditConstant() {
            //private constructor
        }

        public static final String CREDIT_URL = BASE_URL + "/credit";

        public static final String CREDIT_BALANCE_STATEMENT = "/statement/{userId}";

        public static final String BALANCE = "/balance/{userId}";
    }

    public static class CelebrityConstant {
        public static final String CELEBRITY = "/celebrity";
        public static final String CELEBRITY_BASE_URL = BASE_URL + CELEBRITY;
        public static final String FEE = "/fee/{id}";

        private CelebrityConstant() {
        }
    }

    public static class AdvertisementConstant {
        public static final String ADVERTISEMENT = "/advertisement";
        public static final String ACTIVE = "/active";
        public static final String ADVERTISEMENT_BASE_URL = BASE_URL + ADVERTISEMENT;
        public static final String ADMIN_LIST = ADMIN + LIST;
        public static final String ANALYTICS = "/analytics";
        public static final String PROMOTION_ANALYTICS = "/analytics-promotion";


        private AdvertisementConstant() {
        }
    }

    public static class SupportConstant {
        public static final String RESPONSE = "/response";

        private SupportConstant() {

        }

        public static final String SUPPORT_URL = "/support";

        public static final String SUPPORT_BASE_URL = BASE_URL + SUPPORT_URL;
    }

    public static class CommissionConstant {
        private CommissionConstant() {
        }

        public static final String COMMISSION = "/commission";
        public static final String COMMISSION_BASE_URL = BASE_URL + COMMISSION;
    }

    public static class UserManagementConstant {
        public static final String VERIFY_ADVERTISEMENT = "/verify-adv";

        private UserManagementConstant() {
            // default constructor
        }

        public static final String REPORTED_USER = "/reportedUser";
        public static final String USER_MANAGEMENT = "/userManagement";
        public static final String USER_MANAGEMENT_BASE_URL = BASE_URL + USER_MANAGEMENT;
        public static final String SOCIAL_MEDIA_COUNT_URL = "/social-media-count/{userId}";
    }

    public static class EventConstant {
        public static final String EVENT_ID = "/{id}";
        public static final String DELETE_EVENT = "/delete";
        public static final String SUBSCRIBE = "/subscribe";

        private EventConstant() {
        }

        public static final String EVENT = "/event";
        public static final String EVENT_BASE_URL = BASE_URL + EVENT;
    }

    public static class PaymentConstant {
        public static final String TRANSACTION_URL = "/trx";
        public static final String IN_APP_URL = BASE_URL + "/payment";
        public static final String PURCHASE = "/purchase/verify-receipt";
        public static final String SUBSCRIPTION = "/subscription/verify-receipt";
        public static final String ADMIN = TRANSACTION_URL + RestMappingConstant.ADMIN;
        public static final String PUBLIC_REQUEST_DATA_ADMIN = "public-request-data";

        private PaymentConstant() {

        }

        public static final String PAYMENT_URL = BASE_URL + PROMOTION;
    }

    public static class DisputeConstant {
        public static final String DISPUTES = "/disputes";
        public static final String DISPUTE_BASE_URL = BASE_URL + DISPUTES;
        public static final String DECLINE = "/decline";
        public static final String SETTLE = "/settle/{disputeId}";
        public static final String DISPUTES_INFO = "dispute-info/{reqId}";

        private DisputeConstant() {
            // default constructor
        }
    }

    public static class StripeConstant {
        public static final String STRIPE = "/stripe";

        private StripeConstant(){}
    }

    public static class LiveChatConstant {
        private LiveChatConstant() {
        }

        public static final String CHAT_URL = LiveConstant.LIVE_URL + "/chat";
        public static final String PATH_LIVE_STREAM_ID = "/{liveStreamId}";
    }

    public static class CategoryConstant {
        public static final String CATEGORY = "/category";
        public static final String CATEGORY_BASE_URL = BASE_URL + CATEGORY;
        public static final String UPDATE_CATEGORY = "/update/{categoryId}";
        public static final String DELETE = "/delete/{categoryId}";

        private CategoryConstant() {
            // default constructor
        }
    }

    public static class TransactionConstant {
        public static final String TRANSACTION = "/transaction";
        public static final String TRANSACTION_BASE_URL = BASE_URL + TRANSACTION;

        private TransactionConstant() {
            // default constructor
        }
    }


    public static class ConfigConstant {
        private ConfigConstant() {
        }

        public static final String CONFIG_BASE_URL = BASE_URL + "/config";
        public static final String AWS_CONFIG_URL = "/aws";

    }

    public static class EventReactionConstant {
        private EventReactionConstant() {
            // default constructor
        }

        public static final String EVENT_REACTION = BASE_URL + "/event_reaction";
    }

    public static class CelebrityTrxHistoryConstant {
        private CelebrityTrxHistoryConstant() {
            // default Constructor
        }

        public static final String CELEB_TRX_HISTORY = BASE_URL + "/CelebTrxHistory";
    }

    public static class AttendeesConstant {
        private AttendeesConstant() {
        }

        public static final String ATTENDEES = BASE_URL + "/attendees";
    }

    public static class ProfileSubscription {
        public static final String PROFILE_SUBSCRIBE = BASE_URL + "/profile/subscribe";

        private ProfileSubscription() {
        }

    }

    public static class WebHookConstant {
        private WebHookConstant() {
        }

        public static final String SUBSCRIPTION = "/subscription";
        public static final String WEB_HOOK = "/web/hook";
        public static final String SUBSCRIPTION_WEB_HOOK = SUBSCRIPTION + WEB_HOOK;

    }

    public static class DashboardConstant {
        private DashboardConstant() {}
        public static final String DASHBOARD_URL = BASE_URL + "/dashboard";
        public static final String USERS_URL = "/user-data";
        public static final String CONNECT_URL = "/connect-data";
    }

    public static class InviteFriends {
        public static final String INVITE_FRIENDS = BASE_URL+"/invite-friends";
        private InviteFriends(){}

    }

    public static class TvMediaConstants {
        private TvMediaConstants(){}
        public static final String TV_MEDIA_URL = BASE_URL + "/tv-media";
        public static final String TV_MEDIA_CATEGORIES_URL = "/categories";
        public static final String UPDATE_PUBLISH_STATUS_URL = "/publish-status";
        public static final String MEDIA_VIEW_URL = "/media-view";
        public static final String SINGLE_MEDIA = "/{id}";
    }

    public static class PushNotificationConstants {
        public static final String GET_COUNTRY = "/getCountry";

        private PushNotificationConstants(){}
        public static final String PUSH_URL = BASE_URL + "/push";
        public static final String USERS_URL = "/users";
    }
}
