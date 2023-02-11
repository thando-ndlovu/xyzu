package com.xyclonedesigns.xyzu;


public class exoplayerservice
	extends android.app.Service
	implements
		mono.android.IGCUserPeer,
		com.google.android.exoplayer2.text.TextOutput,
		com.google.android.exoplayer2.audio.AudioListener,
		com.google.android.exoplayer2.metadata.MetadataOutput,
		com.google.android.exoplayer2.Player.EventListener,
		com.google.android.exoplayer2.ui.PlayerNotificationManager.NotificationListener,
		com.google.android.exoplayer2.ui.PlayerNotificationManager.MediaDescriptionAdapter
{
/** @hide */
	public static final String __md_methods;
	static {
		__md_methods = 
			"n_onCreate:()V:GetOnCreateHandler\n" +
			"n_onDestroy:()V:GetOnDestroyHandler\n" +
			"n_onStartCommand:(Landroid/content/Intent;II)I:GetOnStartCommand_Landroid_content_Intent_IIHandler\n" +
			"n_onBind:(Landroid/content/Intent;)Landroid/os/IBinder;:GetOnBind_Landroid_content_Intent_Handler\n" +
			"n_onCues:(Ljava/util/List;)V:GetOnCues_Ljava_util_List_Handler:Com.Google.Android.Exoplayer2.Text.ITextOutputInvoker, ExoPlayer.Core\n" +
			"n_onAudioAttributesChanged:(Lcom/google/android/exoplayer2/audio/AudioAttributes;)V:GetOnAudioAttributesChanged_Lcom_google_android_exoplayer2_audio_AudioAttributes_Handler:Com.Google.Android.Exoplayer2.Audio.IAudioListener, ExoPlayer.Core\n" +
			"n_onAudioSessionId:(I)V:GetOnAudioSessionId_IHandler:Com.Google.Android.Exoplayer2.Audio.IAudioListener, ExoPlayer.Core\n" +
			"n_onVolumeChanged:(F)V:GetOnVolumeChanged_FHandler:Com.Google.Android.Exoplayer2.Audio.IAudioListener, ExoPlayer.Core\n" +
			"n_onMetadata:(Lcom/google/android/exoplayer2/metadata/Metadata;)V:GetOnMetadata_Lcom_google_android_exoplayer2_metadata_Metadata_Handler:Com.Google.Android.Exoplayer2.Metadata.IMetadataOutputInvoker, ExoPlayer.Core\n" +
			"n_onIsPlayingChanged:(Z)V:GetOnIsPlayingChanged_ZHandler:Com.Google.Android.Exoplayer2.IPlayerEventListener, ExoPlayer.Core\n" +
			"n_onLoadingChanged:(Z)V:GetOnLoadingChanged_ZHandler:Com.Google.Android.Exoplayer2.IPlayerEventListener, ExoPlayer.Core\n" +
			"n_onPlaybackParametersChanged:(Lcom/google/android/exoplayer2/PlaybackParameters;)V:GetOnPlaybackParametersChanged_Lcom_google_android_exoplayer2_PlaybackParameters_Handler:Com.Google.Android.Exoplayer2.IPlayerEventListener, ExoPlayer.Core\n" +
			"n_onPlaybackSuppressionReasonChanged:(I)V:GetOnPlaybackSuppressionReasonChanged_IHandler:Com.Google.Android.Exoplayer2.IPlayerEventListener, ExoPlayer.Core\n" +
			"n_onPlayerError:(Lcom/google/android/exoplayer2/ExoPlaybackException;)V:GetOnPlayerError_Lcom_google_android_exoplayer2_ExoPlaybackException_Handler:Com.Google.Android.Exoplayer2.IPlayerEventListener, ExoPlayer.Core\n" +
			"n_onPlayerStateChanged:(ZI)V:GetOnPlayerStateChanged_ZIHandler:Com.Google.Android.Exoplayer2.IPlayerEventListener, ExoPlayer.Core\n" +
			"n_onPositionDiscontinuity:(I)V:GetOnPositionDiscontinuity_IHandler:Com.Google.Android.Exoplayer2.IPlayerEventListener, ExoPlayer.Core\n" +
			"n_onRepeatModeChanged:(I)V:GetOnRepeatModeChanged_IHandler:Com.Google.Android.Exoplayer2.IPlayerEventListener, ExoPlayer.Core\n" +
			"n_onSeekProcessed:()V:GetOnSeekProcessedHandler:Com.Google.Android.Exoplayer2.IPlayerEventListener, ExoPlayer.Core\n" +
			"n_onShuffleModeEnabledChanged:(Z)V:GetOnShuffleModeEnabledChanged_ZHandler:Com.Google.Android.Exoplayer2.IPlayerEventListener, ExoPlayer.Core\n" +
			"n_onTimelineChanged:(Lcom/google/android/exoplayer2/Timeline;I)V:GetOnTimelineChanged_Lcom_google_android_exoplayer2_Timeline_IHandler:Com.Google.Android.Exoplayer2.IPlayerEventListener, ExoPlayer.Core\n" +
			"n_onTracksChanged:(Lcom/google/android/exoplayer2/source/TrackGroupArray;Lcom/google/android/exoplayer2/trackselection/TrackSelectionArray;)V:GetOnTracksChanged_Lcom_google_android_exoplayer2_source_TrackGroupArray_Lcom_google_android_exoplayer2_trackselection_TrackSelectionArray_Handler:Com.Google.Android.Exoplayer2.IPlayerEventListener, ExoPlayer.Core\n" +
			"n_onNotificationCancelled:(IZ)V:GetOnNotificationCancelled_IZHandler:Com.Google.Android.Exoplayer2.UI.PlayerNotificationManager/INotificationListener, ExoPlayer.UI\n" +
			"n_onNotificationPosted:(ILandroid/app/Notification;Z)V:GetOnNotificationPosted_ILandroid_app_Notification_ZHandler:Com.Google.Android.Exoplayer2.UI.PlayerNotificationManager/INotificationListener, ExoPlayer.UI\n" +
			"n_onNotificationStarted:(ILandroid/app/Notification;)V:GetOnNotificationStarted_ILandroid_app_Notification_Handler:Com.Google.Android.Exoplayer2.UI.PlayerNotificationManager/INotificationListener, ExoPlayer.UI\n" +
			"n_createCurrentContentIntent:(Lcom/google/android/exoplayer2/Player;)Landroid/app/PendingIntent;:GetCreateCurrentContentIntent_Lcom_google_android_exoplayer2_Player_Handler:Com.Google.Android.Exoplayer2.UI.PlayerNotificationManager/IMediaDescriptionAdapterInvoker, ExoPlayer.UI\n" +
			"n_getCurrentContentText:(Lcom/google/android/exoplayer2/Player;)Ljava/lang/CharSequence;:GetGetCurrentContentText_Lcom_google_android_exoplayer2_Player_Handler:Com.Google.Android.Exoplayer2.UI.PlayerNotificationManager/IMediaDescriptionAdapterInvoker, ExoPlayer.UI\n" +
			"n_getCurrentContentTitle:(Lcom/google/android/exoplayer2/Player;)Ljava/lang/CharSequence;:GetGetCurrentContentTitle_Lcom_google_android_exoplayer2_Player_Handler:Com.Google.Android.Exoplayer2.UI.PlayerNotificationManager/IMediaDescriptionAdapterInvoker, ExoPlayer.UI\n" +
			"n_getCurrentLargeIcon:(Lcom/google/android/exoplayer2/Player;Lcom/google/android/exoplayer2/ui/PlayerNotificationManager$BitmapCallback;)Landroid/graphics/Bitmap;:GetGetCurrentLargeIcon_Lcom_google_android_exoplayer2_Player_Lcom_google_android_exoplayer2_ui_PlayerNotificationManager_BitmapCallback_Handler:Com.Google.Android.Exoplayer2.UI.PlayerNotificationManager/IMediaDescriptionAdapterInvoker, ExoPlayer.UI\n" +
			"n_getCurrentSubText:(Lcom/google/android/exoplayer2/Player;)Ljava/lang/CharSequence;:GetGetCurrentSubText_Lcom_google_android_exoplayer2_Player_Handler:Com.Google.Android.Exoplayer2.UI.PlayerNotificationManager/IMediaDescriptionAdapter, ExoPlayer.UI\n" +
			"";
		mono.android.Runtime.register ("Xyzu.Player.Exoplayer.ExoPlayerService, Xyzu.Exoplayer", exoplayerservice.class, __md_methods);
	}


	public exoplayerservice ()
	{
		super ();
		if (getClass () == exoplayerservice.class)
			mono.android.TypeManager.Activate ("Xyzu.Player.Exoplayer.ExoPlayerService, Xyzu.Exoplayer", "", this, new java.lang.Object[] {  });
	}


	public void onCreate ()
	{
		n_onCreate ();
	}

	private native void n_onCreate ();


	public void onDestroy ()
	{
		n_onDestroy ();
	}

	private native void n_onDestroy ();


	public int onStartCommand (android.content.Intent p0, int p1, int p2)
	{
		return n_onStartCommand (p0, p1, p2);
	}

	private native int n_onStartCommand (android.content.Intent p0, int p1, int p2);


	public android.os.IBinder onBind (android.content.Intent p0)
	{
		return n_onBind (p0);
	}

	private native android.os.IBinder n_onBind (android.content.Intent p0);


	public void onCues (java.util.List p0)
	{
		n_onCues (p0);
	}

	private native void n_onCues (java.util.List p0);


	public void onAudioAttributesChanged (com.google.android.exoplayer2.audio.AudioAttributes p0)
	{
		n_onAudioAttributesChanged (p0);
	}

	private native void n_onAudioAttributesChanged (com.google.android.exoplayer2.audio.AudioAttributes p0);


	public void onAudioSessionId (int p0)
	{
		n_onAudioSessionId (p0);
	}

	private native void n_onAudioSessionId (int p0);


	public void onVolumeChanged (float p0)
	{
		n_onVolumeChanged (p0);
	}

	private native void n_onVolumeChanged (float p0);


	public void onMetadata (com.google.android.exoplayer2.metadata.Metadata p0)
	{
		n_onMetadata (p0);
	}

	private native void n_onMetadata (com.google.android.exoplayer2.metadata.Metadata p0);


	public void onIsPlayingChanged (boolean p0)
	{
		n_onIsPlayingChanged (p0);
	}

	private native void n_onIsPlayingChanged (boolean p0);


	public void onLoadingChanged (boolean p0)
	{
		n_onLoadingChanged (p0);
	}

	private native void n_onLoadingChanged (boolean p0);


	public void onPlaybackParametersChanged (com.google.android.exoplayer2.PlaybackParameters p0)
	{
		n_onPlaybackParametersChanged (p0);
	}

	private native void n_onPlaybackParametersChanged (com.google.android.exoplayer2.PlaybackParameters p0);


	public void onPlaybackSuppressionReasonChanged (int p0)
	{
		n_onPlaybackSuppressionReasonChanged (p0);
	}

	private native void n_onPlaybackSuppressionReasonChanged (int p0);


	public void onPlayerError (com.google.android.exoplayer2.ExoPlaybackException p0)
	{
		n_onPlayerError (p0);
	}

	private native void n_onPlayerError (com.google.android.exoplayer2.ExoPlaybackException p0);


	public void onPlayerStateChanged (boolean p0, int p1)
	{
		n_onPlayerStateChanged (p0, p1);
	}

	private native void n_onPlayerStateChanged (boolean p0, int p1);


	public void onPositionDiscontinuity (int p0)
	{
		n_onPositionDiscontinuity (p0);
	}

	private native void n_onPositionDiscontinuity (int p0);


	public void onRepeatModeChanged (int p0)
	{
		n_onRepeatModeChanged (p0);
	}

	private native void n_onRepeatModeChanged (int p0);


	public void onSeekProcessed ()
	{
		n_onSeekProcessed ();
	}

	private native void n_onSeekProcessed ();


	public void onShuffleModeEnabledChanged (boolean p0)
	{
		n_onShuffleModeEnabledChanged (p0);
	}

	private native void n_onShuffleModeEnabledChanged (boolean p0);


	public void onTimelineChanged (com.google.android.exoplayer2.Timeline p0, int p1)
	{
		n_onTimelineChanged (p0, p1);
	}

	private native void n_onTimelineChanged (com.google.android.exoplayer2.Timeline p0, int p1);


	public void onTracksChanged (com.google.android.exoplayer2.source.TrackGroupArray p0, com.google.android.exoplayer2.trackselection.TrackSelectionArray p1)
	{
		n_onTracksChanged (p0, p1);
	}

	private native void n_onTracksChanged (com.google.android.exoplayer2.source.TrackGroupArray p0, com.google.android.exoplayer2.trackselection.TrackSelectionArray p1);


	public void onNotificationCancelled (int p0, boolean p1)
	{
		n_onNotificationCancelled (p0, p1);
	}

	private native void n_onNotificationCancelled (int p0, boolean p1);


	public void onNotificationPosted (int p0, android.app.Notification p1, boolean p2)
	{
		n_onNotificationPosted (p0, p1, p2);
	}

	private native void n_onNotificationPosted (int p0, android.app.Notification p1, boolean p2);


	public void onNotificationStarted (int p0, android.app.Notification p1)
	{
		n_onNotificationStarted (p0, p1);
	}

	private native void n_onNotificationStarted (int p0, android.app.Notification p1);


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
