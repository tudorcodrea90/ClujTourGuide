package com.example.android.clujtourguide;

/**
 * Created by Tudor Cristian on 29.06.2017.
 */

/**
 * {@link TourItem} represents an item which will be shown in the tour_list layout.
 * It contains an image, a title, a phone number, an address, a duration, a subtext and a price
 * range.
 */

public class TourItem {

    /** Image resource ID for the item (all categories) */
    private int mImageResourceID;

    /** Title of the item (all categories) */
    private String mTitle;

    /** Phone number for the item (restaurants, guided tours) */
    private String mPhoneNumber = NO_PHONE_NUMBER_PROVIDED;

    /** Address for the item (all categories) */
    private String mAddress;

    /** Subtext with a few words about each item (all categories) */
    private String mDescription;

    /** Price range for the item (restaurants, hotels) */
    private String mPriceRange;


    //** Constant value that represents no duration was provided for this item */
    private static final int NO_DURATION_PROVIDED = -1;

    //** Constant value that represents no phone number was provided for this item */
    private static final String NO_PHONE_NUMBER_PROVIDED = "None";


    /**
     * Create a new TourItem object for Restaurants, Attractions
     *
     * @param imageResourceID is the resource ID for the image to be used
     * @param title is the item name
     * @param address is the address of the sight/locale
     * @param description is the text accompanying the item
     * @param priceRange is the price range in $ - $$$$
     */

    public TourItem(int imageResourceID, String title,
                    String address, String description, String priceRange){
        mImageResourceID = imageResourceID;
        mTitle = title;
        mAddress = address;
        mDescription = description;
        mPriceRange = priceRange;
    }


    /**
     * Create a new TourItem object for Nightlife and Hotels
     * @param imageResourceID is the resource ID for the image to be used
     * @param title is the item name
     * @param description is the item name
     * @param address is the address of the sight/locale
     * @param phoneNumber of the item
     * @param priceRange of the item
     */

    public TourItem(int imageResourceID, String title, String phoneNumber, String description,
                    String address, String priceRange){
        mImageResourceID = imageResourceID;
        mTitle = title;
        mDescription = description;
        mAddress = address;
        mPhoneNumber = phoneNumber;
        mPriceRange = priceRange;
    }

    /** Methods for getting all the aforementioned variables */
    public int getmImageResourceID() {
        return mImageResourceID;
    }

    public String getmTitle() {
        return mTitle;
    }

    public String getmPhoneNumber() {
        return mPhoneNumber;
    }

    public String getmAddress() {
        return mAddress;
    }


    public String getmDescription() {
        return mDescription;
    }

    public String getmPriceRange() {
        return mPriceRange;
    }


    public boolean hasPhoneNumber() {
        return mPhoneNumber != NO_PHONE_NUMBER_PROVIDED;
    }

}
