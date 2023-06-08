package com.example.demo.constant;

import static com.example.demo.constant.Constants.TEXT_MSG_CHAR_LIMIT;

public class MessageConstants {
    public static final String CONNECTOR_ID_MISMATCH = "Connector id mismatch.";
    public static final String INVALID_CELEB_FEE_ID = "Invalid connector id.";
    public static final String INVALID_SORT_TYPE = "Invalid sort type %s , valid types : ACTIVE, PENDING";
    public static final String PROMOTION_NAME_ALREADY_EXIST = "Promotion name already exist.";
    public static final String REQUEST_NO_LONGER_VALID = "Request is no longer valid.";
    public static final String UNAUTHORIZED_USER = "Unauthorized user.";
    public static final String SUPPORT_REQUEST_NOT_FOUND = "Support request not found.";
    public static final String INVALID_ADMIN_ID = "Admin id not found.";
    public static final String RESPONSE = "${response}";
    public static final String ROLE_NOT_FOUND = "This Role is not found.";
    public static final String TIME_ZONE_NOT_SUPPORTED = "TimeZone not supported. Supported timeZones are  CST, IST, EST, MST, PST";
    public static final String EVENT_NOT_FOUND = "Event id not found.";
    public static final String EVENT_NOT_SUBSCRIBED = "Make sure you have purchased ticket to join the event.";
    public static final String EVENT_UPDATE_FAILURE = "Event can not be updated.";
    public static final String DATE_FORMAT_EXCEPTION_MESSAGE = "You have entered invalid date format, valid date format is yyyy-MM-dd.";
    public static final String TIME_FORMAT_EXCEPTION_MESSAGE = "You have entered invalid time format, valid time format is HH:mm:ss.";
    public static final String START_TIME_NOT_NULL_MESSAGE = "Start time can not be null.";
    public static final String START_DATE_NOT_NULL_MESSAGE = "Start date can not be null.";
    public static final String TIMEZONE_NULL_MESSAGE = "Timezone must be one of the following type: CST or IST or EST or MST or PST";
    public static final String DESCRIPTION_NULL_MESSAGE = "Description must have at least 5 and max 1000 characters.";
    public static final String EVENT_STATUS_NOT_SUPPORTED = "Event status not supported.";
    public static final String CELEBRITY_FEE_NOT_FOUND = "Celebrity fee not found.";
    public static final String CARD_EXCEPTION_MESSAGE = "Card decline.";
    public static final String RATE_LIMIT_EXCEPTION_MESSAGE = "Unable to process request...Please retry after sometime.";
    public static final String INVALID_REQUEST_MESSAGE = "Please enter valid details.";
    public static final String AUTHENTICATION_EXCEPTION = "Request can not be processed.please try after sometime.";
    public static final String STRIPE_EXCEPTION = "Stripe Exception.";
    public static final String EXCEPTION = "Something went wrong.";
    public static final String REQUEST_ALREADY_IN_PROGRESS = "Request already in progress.";
    public static final String PROMOTION_REQUEST_ALREADY_PROCESSED = "Promotion request has already been processed.";
    public static final String STRIPE_SUCCESS = "Success";
    public static final String VIP_CODE = "vipCode";
    public static final String PASSWORD = "password";
    public static final String PROFESSION_NOT_FOUND = "Profession id not found.";
    public static final String ACCOUNT_VERIFIED_ALREADY = "Account verified already.";
    public static final String CONCERN_NOT_FOUND = "Concern not found.";
    public static final String DISPUTE_NOT_FOUND = "Dispute not found.";
    public static final String TRANSACTION_NOT_FOUND = "Transaction not found.";
    public static final String STATUS = "${status}";
    public static final String CATEGORY_ALREADY_AVAILABLE = "category already available.";
    public static final String CATEGORY_NOT_FOUND = "category not found.";
    public static final String INTEREST_NOT_FOUND = "Interest not found.";
    public static final String THIS_INTEREST_ALREADY_AVAILABLE = "This Interest Already Available.";

    public static final String START_DATE_EXCEPTION = "Start date must be greater than current date time.";
    public static final String EVENT_USER_MAP_NOT_FOUND = "Event not subscribed.";
    public static final String PAYMENT_FAILED = "Payment was not successful.";
    public static final String STREAM_NOT_AVAILABLE = "Stream Not Found.";
    public static final String LIKE_AND_LOVE_CANT_ZERO = "Like & heart both can't be zero.";
    public static final String PROMOTION_REWARD_EXHAUSTED = "No more reward available.";
    public static final String PAYOUT_NOT_FOUND = "Payout not found.";
    public static final String BALANCE_NOT_AVAILABLE = "Balance Not Available.";
    public static final String INSUFFICIENT_CREDIT = "Insufficient balance.";
    public static final String EVENT_ALREADY_DELETED = "Event already deleted.";
    public static final String TICKET_ALREADY_PURCHASED = "Ticket already purchased.";
    public static final String ALREADY_SUBSCRIBED = "Already subscribed.";
    public static final String NOT_ELIGIBLE = "You need to purchased the package.";
    public static final String NO_PRODUCT_AVAILABLE = "Products not available.";
    public static final String MAX_SUBSCRIPTION_LIMIT_REACHED = "Max subscription limit reached.";
    public static final String INVALID_RECEIPT = "Invalid receipt.";
    public static final String PAYOUT_EMAIL_TEXT = "Your earning from connect account is transferred to your PayPal account. For any questions/concerns, you can email us at hello@starsonboard.app";
    public static final String PAYOUT_EMAIL_SUBJECT = "Payout From Connect Successful!";
    public static final String SUBSCRIPTION_SUCCESS = "Subscribed: You have successfully subscribed %d of %d profiles.";
    public static final String LIMIT_EXCEEDED = "Take advantage of these great offers to expand your VIP access and add this celebrity / Professional Executive now";
    public static final String CELEBRITY_NOT_NULL = "celebId can not be null.";
    public static final String PRODUCT_NOT_FOUND = "Product not found.";
    public static final String INVALID_PACKAGE_TYPE = "Invalid package type.";
    public static final String PACKAGE_ALREADY_PURCHASED = "Package already purchased.";
    public static final String USER_SUBSCRIPTION_NOT_FOUND = "User subscription not found.";
    public static final String SOMETHING_WENT_WRONG = "Something went wrong.";
    public static final String INVALID_USER_ID = "You seem to be using another email address for purchasing the subscription. In case you feel this is happening in error, please check the account or try switching to another account.";
    public static final String DISPUTE_TIMEOUT_MESSAGE = "you can't raise dispute after %s days";
    public static final String INVALID_VIP_CODE = "This code seems to be invalid/consumed. Please reach us on hello@starsonboard.app";
    public static final String EVENT_WEB_URL = "${EVENT_WEB_URL}";
    public static final String APP_LINK = "${link}";
    public static final String STRIPE_CANCEL_ERROR_MESSAGE = "Could not reject the request. Please try later.";
    public static final String STRIPE_CAPTURE_ERROR_MESSAGE = "Could not accept the request. Please try later.";
    public static final String USER_LOGIN_DISABLED = "Your account is disabled. If you think it's done in error, please contact support@starsonboard.app";

    private MessageConstants() {
        //private constructor
    }

    public static final String USER_NOT_FOUND = "User id not exist";
    public static final String CELEBRITY_NOT_FOUND = "Celebrity id not exist";
    public static final String MEDIA_NOT_FOUND = "Media id does not exist";

    public static final String TEXT_MSG_LIMIT_ERROR = "Text message should not be more then " + TEXT_MSG_CHAR_LIMIT + " character long";
    public static final String ALREADY_REQUEST_SEND = "Request already send for this media";
    public static final String ALREADY_RESPONSE_SEND = "You already responded for this media";
    public static final String INVALID_CONNECT_ID = "Invalid connect id";
    public static final String INVALID_REQUEST = "Invalid request";

    public static final String POST_NOT_FOUND = "Post does not exist";
    public static final String INVALID_GO_LIVE_DATE = "Announcement time should be after %d hour from now";
    public static final String POST_TYPE_NOT_GO_LIVE = "Post type must be go live announcement";
    public static final String POST_GO_LIVE_DATE_PASSED = "You can't mark past date go live announcement";
    public static final String NOT_AUTHORIZED = "You are not authorized to perform this action";
    public static final String MEDIA_CATEGORY_MUST_BE = "Media category must be of type %s";

    public static final String ALREADY_APPLIED_UPGRADE_ACCOUNT = "You have already applied to upgrade the account";
    public static final String ALREADY_INFLUENCER = "User already have celebrity role";
    public static final String NO_PENDING_UPGRADE_REQUEST = "This user don't have any pending upgrade request";

    public static final String CELEB_RESPONSE = "celeb.response";

    public static final String CELEB_RESPONSE_TITLE = "celeb.response.title";

    public static final String CONNECT_TEXT_REQUESTS = "connect.text";

    public static final String CONNECT_REQUESTS_NOT_FOUND = "Connect Request not found";

    public static final String CONNECT_REQ_CONCERN_ALREADY_RAISED = "Dispute already raised for this connect request";

    public static final String CONNECT_TEXT_REQUESTS_TITLE = "connect.text.title";

    public static final String CELEB_PENDING_REQUESTS = "celeb.pendingRequests";

    public static final String CELEB_PENDING_REQUESTS_TITLE = "celeb.pendingRequests.title";

    public static final String INVALID_LIVE_REQUEST_ID = "Live request id not found";

    public static final String INVALID_REFRESH_TOKEN = "Invalid refresh token";

    public static final String OTP = "${otp}";

    public static final String PROMOTION_NOT_FOUND = "Promotion id not found";

    public static final String NAME = "${user}";

    public static final String PROMOTION_REQUEST_NOT_FOUND = "Promotion request id not found";

    public static final String PROMOTION_VIEW_LIMIT_REACHED = "This promotion view limit gets over";

    public static final String ALREADY_GOT_REWARD = "You already got the reward for this promotion";

    //Push Titles
    public static final String TITLE_CONNECT_REQUEST = "Connect Request";
    public static final String TITLE_CONNECT_RESPONSE = "Connect Response";
    public static final String TITLE_CONNECT_REMINDER = "Reminder";
    public static final String TITLE_UPGRADE_USER_APPROVED = "Upgrade Request Approved";
    public static final String TITLE_UPGRADE_USER_REJECTED = "Upgrade Request Rejected";
    public static final String TITLE_AD_REQUEST = "Advertisement Request";
    public static final String TITLE_GO_LIVE_REQUEST_APPROVED = "Go Live Request Approved";
    public static final String TITLE_GO_LIVE_REQUEST_REJECT = "Go Live Request Rejected";
    public static final String TITLE_GO_LIVE_ANNOUNCE_UPDATED = "Announcement Updated";
    public static final String TITLE_GO_LIVE_ANNOUNCE_REMINDER = "Announcement Reminder";
    public static final String TITLE_GO_LIVE_ANNOUNCE_DELETED = "Announcement Deleted";
    public static final String TITLE_CONNECT_DISPUTE_DECLINED = "Connect Dispute";
    public static final String TITLE_CONNECT_DISPUTE_SETTLED = "Connect Dispute";
    public static final String TITLE_CONNECT_REFUND = "Refund";
    public static final String TITLE_NEW_POST = "New Post";
    public static final String TITLE_NEW_PROMOTION = "New Promotion";
    public static final String TITLE_EVENT_EDITED = "Event Edited";
    public static final String TITLE_EVENT_DELETED = "Event Delete";
    public static final String TITLE_CELEB_LIVE = "Live";

    //Push messages
    public static final String MSG_CONNECT_REQUEST = "You have a new %s request from %s";
    public static final String MSG_PUBLIC_CONNECT_REQUEST = "You have a new %s Public Request from %s";
    public static final String MSG_PUBLIC_PARTICIPANT_REQUEST = "You have a new Participant %s for the %s Public Request";
    public static final String MSG_CONNECT_RESPONSE = "%s has responded to your %s request";
    public static final String MSG_CONNECT_REMINDER = "You have few open connect requests to be responded";
    public static final String MSG_UPGRADE_USER_APPROVED = "Congratulations! Your request has been approved. Please visit your Profile/Manage Fees and set your fees";
    public static final String MSG_UPGRADE_USER_REJECTED = "Your request to become a celebrity has been rejected";
    public static final String MSG_AD_REQUEST = "%s has sent an advertisement request";
    public static final String MSG_GO_LIVE_REQUEST_APPROVED = "Your request to go live has been approved";
    public static final String MSG_GO_LIVE_REQUEST_REJECT = "Your request to go live has been rejected";
    public static final String MSG_GO_LIVE_ANNOUNCE_UPDATED = "Go live announcement has been updated by %s";
    public static final String MSG_GO_LIVE_ANNOUNCE_REMINDER = "%s is about to go live now";
    public static final String MSG_GO_LIVE_ANNOUNCE_DELETED = "Go live announcement deleted by %s";
    public static final String MSG_CONNECT_DISPUTE_DECLINED = "The reviewer has declined the Dispute. Tap here to read the details.";
    public static final String MSG_CONNECT_DISPUTE_SETTLED = "The reviewer has approved the Dispute and an amount of credits worth %s has been credited to your account. To review the same visit credit statement";
    public static final String MSG_CONNECT_REFUND = "Refund of %s credits has been added to your credits account. To review the same visit credit statement";
    public static final String MSG_NEW_POST = "%s has added new content which could be of your interest";
    public static final String MSG_NEW_PROMOTION = "New promotion available";
    public static final String MSG_EVENT_EDITED = "%s event has been edited";
    public static final String MSG_EVENT_DELETED = "%s event has been deleted";
    public static final String MSG_CELEB_LIVE = "%s is live now";

    public static final String ALREADY_REQUEST_GO_LIVE = "You have already request to go live";
    public static final String REQUEST_GO_LIVE_ALREADY_APPROVED = "Your request to go live already approved";

    public static final String INVALID_CELEBRITY_FEES = "Invalid celebrity fees";
    public static final String CELEBRITY_FEE_UPDATED = "Celebrity has updated the fee for this service";
    public static final String EVENT_FEE_UPDATED = "Event ticket updated";


    public static final String NO_LIVE_STREAM_AVAILABLE = "There is no live stream available for this celebrity";
    public static final String NO_LIVE_EVENT_STREAM_AVAILABLE = "There is no live stream available for this event";

}
