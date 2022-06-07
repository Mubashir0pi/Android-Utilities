Android-Utilities

How to add lib in project 

Step 1

Downlaod android-utilities.aar ---> move to ---> libs folder under app


Step 2

Settings.gradle --> add   include ':android-utilities'

Step 3 

build.gradle -- > add

dependencies {
    implementation fileTree(dir: 'libs', include: ['*.aar'])

}


General

* hideKeyboard
* showKeyboard
* getDeviceId
* formatDate
* addFocusNextTextWatcherOnMaxLimit
* addRunnableTextWatcher
* isEmailValid
* isPasswordValid
* hasNumber
* round
* getMd5
* shareText
* isNetworkAvailable
* pxTodp
* dpTopx
* fromHtml
* fromHtmlSpanned
* isMobileNumberValid
* isEnglishText
* isContainHTML
* removeSpaces
* getTimeAgo   e.g 1 hour ago , yesterday
* convertDpToPixels
* computeDistance
* concatMultiLanguageStrings



BitmapHelper

* vectorToBitmap(context: Context, @DrawableRes id: Int, @ColorInt color: Int)
* getBitmapFromURL(src: String?)
* flip(src: Bitmap, type: Int)

ImageUtil

* scaleBitmap(bitmap: Bitmap?): Bitmap?
* decodeUri(mContext: Context, selectedImage: Uri?): Bitmap?
* getUndefinedRotation(context: Context, filePath: String): Int
* rotateBitmap(mContext: Context, bitmap: Bitmap, uri: Uri, PIC_FROM: Int): Bitmap?
* getImageUri(mContext: Context, bitmap: Bitmap?): Uri?
* getThumbnail(mContext: Context, uri: Uri?): Bitmap?
* getBase64String(bitmap: Bitmap): String
* getBitmapString(bitmap: Bitmap): ByteArray
*  blurRenderScript(smallBitmap: Bitmap, radius: Int, mContext: Context?): Bitmap?

Timer

*  setPeriodic(cb: Listener, period: Long): Boolean
*  clear(): Boolean
*  set(cb: Listener, delay: Long): Boolean

LocationManager

* getLatitude(): Double
* getLongitude(): Double

PermissionsManager
* request permission