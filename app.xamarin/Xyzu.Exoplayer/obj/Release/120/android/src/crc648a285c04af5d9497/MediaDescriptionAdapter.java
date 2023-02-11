package crc648a285c04af5d9497;


public class MediaDescriptionAdapter
	extends java.lang.Object
	implements
		mono.android.IGCUserPeer,
		com.google.android.exoplayer2.ui.PlayerNotificationManager.MediaDescriptionAdapter
{
/** @hide */
	public static final String __md_methods;
	static {
		__md_methods = 
			"n_createCurrentContentIntent:(Lcom/google/android/exoplayer2/Player;)Landroid/app/PendingIntent;:GetCreateCurrentContentIntent_Lcom_google_android_exoplayer2_Player_Handler:Com.Google.Android.Exoplayer2.UI.PlayerNotificationManager/IMediaDescriptionAdapterInvoker, ExoPlayer.UI\n" +
			"n_getCurrentContentText:(Lcom/google/android/exoplayer2/Player;)Ljava/lang/CharSequence;:GetGetCurrentContentText_Lcom_google_android_exoplayer2_Player_Handler:Com.Google.Android.Exoplayer2.UI.PlayerNotificationManager/IMediaDescriptionAdapterInvoker, ExoPlayer.UI\n" +
			"n_getCurrentContentTitle:(Lcom/google/android/exoplayer2/Player;)Ljava/lang/CharSequence;:GetGetCurrentContentTitle_Lcom_google_android_exoplayer2_Player_Handler:Com.Google.Android.Exoplayer2.UI.PlayerNotificationManager/IMediaDescriptionAdapterInvoker, ExoPlayer.UI\n" +
			"n_getCurrentLargeIcon:(Lcom/google/android/exoplayer2/Player;Lcom/google/android/exoplayer2/ui/PlayerNotificationManager$BitmapCallback;)Landroid/graphics/Bitmap;:GetGetCurrentLargeIcon_Lcom_google_android_exoplayer2_Player_Lcom_google_android_exoplayer2_ui_PlayerNotificationManager_BitmapCallback_Handler:Com.Google.Android.Exoplayer2.UI.PlayerNotificationManager/IMediaDescriptionAdapterInvoker, ExoPlayer.UI\n" +
			"n_getCurrentSubText:(Lcom/google/android/exoplayer2/Player;)Ljava/lang/CharSequence;:GetGetCurrentSubText_Lcom_google_android_exoplayer2_Player_Handler:Com.Google.Android.Exoplayer2.UI.PlayerNotificationManager/IMediaDescriptionAdapter, ExoPlayer.UI\n" +
			"";
		mono.android.Runtime.register ("Com.Google.Android.Exoplayer2.UI.MediaDescriptionAdapter, Xyzu.Exoplayer", MediaDescriptionAdapter.class, __md_methods);
	}


	public MediaDescriptionAdapter ()
	{
		super ();
		if (getClass () == MediaDescriptionAdapter.class)
			mono.android.TypeManager.Activate ("Com.Google.Android.Exoplayer2.UI.MediaDescriptionAdapter, Xyzu.Exoplayer", "", this, new java.lang.Object[] {  });
	}

	public MediaDescriptionAdapter (android.app.PendingIntent p0, java.lang.String p1, java.lang.String p2, java.lang.String p3, android.graphics.Bitmap p4)
	{
		super ();
		if (getClass () == MediaDescriptionAdapter.class)
			mono.android.TypeManager.Activate ("Com.Google.Android.Exoplayer2.UI.MediaDescriptionAdapter, Xyzu.Exoplayer", "Android.App.PendingIntent, Mono.Android:System.String, mscorlib:System.String, mscorlib:System.String, mscorlib:Android.Graphics.Bitmap, Mono.Android", this, new java.lang.Object[] { p0, p1, p2, p3, p4 });
	}

	public MediaDescriptionAdapter (android.app.PendingIntent p0, java.lang.CharSequence p1, java.lang.CharSequence p2, java.lang.CharSequence p3, android.graphics.Bitmap p4)
	{
		super ();
		if (getClass () == MediaDescriptionAdapter.class)
			mono.android.TypeManager.Activate ("Com.Google.Android.Exoplayer2.UI.MediaDescriptionAdapter, Xyzu.Exoplayer", "Android.App.PendingIntent, Mono.Android:Java.Lang.ICharSequence, Mono.Android:Java.Lang.ICharSequence, Mono.Android:Java.Lang.ICharSequence, Mono.Android:Android.Graphics.Bitmap, Mono.Android", this, new java.lang.Object[] { p0, p1, p2, p3, p4 });
	}


	public android.app.PendingIntent createCurrentContentIntent (com.google.android.exoplayer2.Player p0)
	{
		return n_createCurrentContentIntent (p0);
	}

	private native android.app.PendingIntent n_createCurrentContentIntent (com.google.android.exoplayer2.Player p0);


	public java.lang.CharSequence getCurrentContentText (com.google.android.exoplayer2.Player p0)
	{
		return n_getCurrentContentText (p0);
	}

	private native java.lang.CharSequence n_getCurrentContentText (com.google.android.exoplayer2.Player p0);


	public java.lang.CharSequence getCurrentContentTitle (com.google.android.exoplayer2.Player p0)
	{
		return n_getCurrentContentTitle (p0);
	}

	private native java.lang.CharSequence n_getCurrentContentTitle (com.google.android.exoplayer2.Player p0);


	public android.graphics.Bitmap getCurrentLargeIcon (com.google.android.exoplayer2.Player p0, com.google.android.exoplayer2.ui.PlayerNotificationManager.BitmapCallback p1)
	{
		return n_getCurrentLargeIcon (p0, p1);
	}

	private native android.graphics.Bitmap n_getCurrentLargeIcon (com.google.android.exoplayer2.Player p0, com.google.android.exoplayer2.ui.PlayerNotificationManager.BitmapCallback p1);


	public java.lang.CharSequence getCurrentSubText (com.google.android.exoplayer2.Player p0)
	{
		return n_getCurrentSubText (p0);
	}

	private native java.lang.CharSequence n_getCurrentSubText (com.google.android.exoplayer2.Player p0);

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
