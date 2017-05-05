package vulan.com.trackingstore.util;

/**
 * Created by VULAN on 10/21/2016.
 */

public class Constants {
    public static final String BASE_URL = "http://doanbeacon.com/";

    public static final class Menu {
        public static final int MENU_HOME = 0;
        public static final int MENU_LIST_SHOP = 1;
        public static final int MENU_SEARCH = 2;
        public static final int MENU_SETTING = 3;
    }

    public static final class FragmentTag {
        public static final String HOME = "home fragment";
        public static final String LIST = "list fragment";
        public static final String SEARCH = "search fragment";
        public static final String SETTINGS = "setting fragment";
        public static final String SHOP = "shop fragment";
        public static final String PRODUCT = "product fragment";
        public static final String PRODUCT_DETAIL = "product detail fragment";
    }

    public static final class RecyclerViewType {
        public static final int CATEGORY_TYPE = 1;
        public static final int PROMOTION_TYPE = 2;
        public static final int PRODUCT_TYPE = 3;

    }


    public static final class ShopInfo {
        public static final String SHOP_MODEL = "shop";
        public static final String SHOP_ID = "shop id";
        public static final String CATEGORY_ID = "category id";
        public static final String CATEGORY_NAME = "category name";
        public static final String PRODUCT = "product";
    }

    public static final class Location {
        public static final String LOCATION_HOME = "locationHome";
        public static final String COORDINATE = "location";
        public static final int RESUME_MAP = 1;
        public static final int NORMAL_MAP = 0;
    }

    public static final class Settings {
        public static final String NOTIFY_SETTING = "notify";
        public static final String VIBRATE_SETTING = "vibrate";
        public static final String RING_SETTING = "ring";

    }
    public static final String TAG_SEARCH = "tag search";
    public static final String MAC_ID = "mac ids";
    public static final String STATUS_SEARCH = "status search";
    public static final String STATUS_MACID = "status macid";
    public static final String MAC_ID_SEARCH = "macid search";
    public static final String NOTIFICATION_SHOW = "showNotification";
    public static final String NOTIFICATION_LIST = "listNotification";
}
