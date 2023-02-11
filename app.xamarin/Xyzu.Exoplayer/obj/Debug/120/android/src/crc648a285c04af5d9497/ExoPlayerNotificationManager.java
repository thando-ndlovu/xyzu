package crc648a285c04af5d9497;


public class ExoPlayerNotificationManager
	extends com.google.android.exoplayer2.ui.PlayerNotificationManager
	implements
		mono.android.IGCUserPeer
{
/** @hide */
	public static final String __md_methods;
	static {
		__md_methods = 
			"n_getActionIndicesForCompactView:(Ljava/util/List;Lcom/google/android/exoplayer2/Player;)[I:GetGetActionIndicesForCompactView_Ljava_util_List_Lcom_google_android_exoplayer2_Player_Handler\n" +
			"n_createNotification:(Lcom/google/android/exoplayer2/Player;Landroidx/core/app/NotificationCompat$Builder;ZLandroid/graphics/Bitmap;)Landroidx/core/app/NotificationCompat$Builder;:GetCreateNotification_Lcom_google_android_exoplayer2_Player_Landroidx_core_app_NotificationCompat_Builder_ZLandroid_graphics_Bitmap_Handler\n" +
			"";
		mono.android.Runtime.register ("Com.Google.Android.Exoplayer2.UI.ExoPlayerNotificationManager, Xyzu.Exoplayer", ExoPlayerNotificationManager.class, __md_methods);
	}


	public ExoPlayerNotificationManager (android.content.Context p0, java.lang.String p1, int p2, com.google.android.exoplayer2.ui.PlayerNotificationManager.MediaDescriptionAdapter p3)
	{
		super (p0, p1, p2, p3);
		if (getClass () == ExoPlayerNotificationManager.class)
			mono.android.TypeManager.Activate ("Com.Google.Android.Exoplayer2.UI.ExoPlayerNotificationManager, Xyzu.Exoplayer", "Android.Content.Context, Mono.Android:System.String, mscorlib:System.Int32, mscorlib:Com.Google.Android.Exoplayer2.UI.PlayerNotificationManager+IMediaDescriptionAdapter, ExoPlayer.UI", this, new java.lang.Object[] { p0, p1, p2, p3 });
	}


	public ExoPlayerNotificationManager (android.content.Context p0, java.lang.String p1, int p2, com.google.android.exoplayer2.ui.PlayerNotificationManager.MediaDescriptionAdapter p3, com.google.android.exoplayer2.ui.PlayerNotificationManager.CustomActionReceiver p4)
	{
		super (p0, p1, p2, p3, p4);
		if (getClass () == ExoPlayerNotificationManager.class)
			mono.android.TypeManager.Activate ("Com.Google.Android.Exoplayer2.UI.ExoPlayerNotificationManager, Xyzu.Exoplayer", "Android.Content.Context, Mono.Android:System.String, mscorlib:System.Int32, mscorlib:Com.Google.Android.Exoplayer2.UI.PlayerNotificationManager+IMediaDescriptionAdapter, ExoPlayer.UI:Com.Google.Android.Exoplayer2.UI.PlayerNotificationManager+ICustomActionReceiver, ExoPlayer.UI", this, new java.lang.Object[] { p0, p1, p2, p3, p4 });
	}


	public ExoPlayerNotificationManager (android.content.Context p0, java.lang.String p1, int p2, com.google.android.exoplayer2.ui.PlayerNotificationManager.MediaDescriptionAdapter p3, com.google.android.exoplayer2.ui.PlayerNotificationManager.NotificationListener p4)
	{
		super (p0, p1, p2, p3, p4);
		if (getClass () == ExoPlayerNotificationManager.class)
			mono.android.TypeManager.Activate ("Com.Google.Android.Exoplayer2.UI.ExoPlayerNotificationManager, Xyzu.Exoplayer", "Android.Content.Context, Mono.Android:System.String, mscorlib:System.Int32, mscorlib:Com.Google.Android.Exoplayer2.UI.PlayerNotificationManager+IMediaDescriptionAdapter, ExoPlayer.UI:Com.Google.Android.Exoplayer2.UI.PlayerNotificationManager+INotificationListener, ExoPlayer.UI", this, new java.lang.Object[] { p0, p1, p2, p3, p4 });
	}


	public ExoPlayerNotificationManager (android.content.Context p0, java.lang.String p1, int p2, com.google.android.exoplayer2.ui.PlayerNotificationManager.MediaDescriptionAdapter p3, com.google.android.exoplayer2.ui.PlayerNotificationManager.NotificationListener p4, com.google.android.exoplayer2.ui.PlayerNotificationManager.CustomActionReceiver p5)
	{
		super (p0, p1, p2, p3, p4, p5);
		if (getClass () == ExoPlayerNotificationManager.class)
			mono.android.TypeManager.Activate ("Com.Google.Android.Exoplayer2.UI.ExoPlayerNotificationManager, Xyzu.Exoplayer", "Android.Content.Context, Mono.Android:System.String, mscorlib:System.Int32, mscorlib:Com.Google.Android.Exoplayer2.UI.PlayerNotificationManager+IMediaDescriptionAdapter, ExoPlayer.UI:Com.Google.Android.Exoplayer2.UI.PlayerNotificationManager+INotificationListener, ExoPlayer.UI:Com.Google.Android.Exoplayer2.UI.PlayerNotificationManager+ICustomActionReceiver, ExoPlayer.UI", this, new java.lang.Object[] { p0, p1, p2, p3, p4, p5 });
	}


	public int[] getActionIndicesForCompactView (java.util.List p0, com.google.android.exoplayer2.Player p1)
	{
		return n_getActionIndicesForCompactView (p0, p1);
	}

	private native int[] n_getActionIndicesForCompactView (java.util.List p0, com.google.android.exoplayer2.Player p1);


	public androidx.core.app.NotificationCompat.Builder createNotification (com.google.android.exoplayer2.Player p0, androidx.core.app.NotificationCompat.Builder p1, boolean p2, android.graphics.Bitmap p3)
	{
		return n_createNotification (p0, p1, p2, p3);
	}

	private native androidx.core.app.NotificationCompat.Builder n_createNotification (com.google.android.exoplayer2.Player p0, androidx.core.app.NotificationCompat.Builder p1, boolean p2, android.graphics.Bitmap p3);

	private java.util.ArrayList refList;
	public void monodroidAddReference (java.lang.Object obj)
	{
		if (refList == null)
			refList = new java.util.ArrayList ();
		refList.add (obj);
	}

	public void monodroidClearReferences ()
	{
		if (refList != null)
			refList.clear ();
	}
}
