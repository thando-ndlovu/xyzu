package crc6412508c95ecb263f3;


public class NowPlayingView
	extends androidx.constraintlayout.motion.widget.MotionLayout
	implements
		mono.android.IGCUserPeer,
		androidx.constraintlayout.motion.widget.MotionLayout.TransitionListener,
		com.oze.music.musicbar.MusicBar.OnMusicBarProgressChangeListener
{
/** @hide */
	public static final String __md_methods;
	static {
		__md_methods = 
			"n_onAttachedToWindow:()V:GetOnAttachedToWindowHandler\n" +
			"n_onDetachedFromWindow:()V:GetOnDetachedFromWindowHandler\n" +
			"n_setTransition:(I)V:GetSetTransition_IHandler\n" +
			"n_setTransition:(II)V:GetSetTransition_IIHandler\n" +
			"n_setTransition:(Landroidx/constraintlayout/motion/widget/MotionScene$Transition;)V:GetSetTransition_Landroidx_constraintlayout_motion_widget_MotionScene_Transition_Handler\n" +
			"n_onTransitionChange:(Landroidx/constraintlayout/motion/widget/MotionLayout;IIF)V:GetOnTransitionChange_Landroidx_constraintlayout_motion_widget_MotionLayout_IIFHandler:AndroidX.ConstraintLayout.Motion.Widget.MotionLayout/ITransitionListenerInvoker, Xamarin.AndroidX.ConstraintLayout\n" +
			"n_onTransitionCompleted:(Landroidx/constraintlayout/motion/widget/MotionLayout;I)V:GetOnTransitionCompleted_Landroidx_constraintlayout_motion_widget_MotionLayout_IHandler:AndroidX.ConstraintLayout.Motion.Widget.MotionLayout/ITransitionListenerInvoker, Xamarin.AndroidX.ConstraintLayout\n" +
			"n_onTransitionStarted:(Landroidx/constraintlayout/motion/widget/MotionLayout;II)V:GetOnTransitionStarted_Landroidx_constraintlayout_motion_widget_MotionLayout_IIHandler:AndroidX.ConstraintLayout.Motion.Widget.MotionLayout/ITransitionListenerInvoker, Xamarin.AndroidX.ConstraintLayout\n" +
			"n_onTransitionTrigger:(Landroidx/constraintlayout/motion/widget/MotionLayout;IZF)V:GetOnTransitionTrigger_Landroidx_constraintlayout_motion_widget_MotionLayout_IZFHandler:AndroidX.ConstraintLayout.Motion.Widget.MotionLayout/ITransitionListenerInvoker, Xamarin.AndroidX.ConstraintLayout\n" +
			"n_onProgressChanged:(Lcom/oze/music/musicbar/MusicBar;IZ)V:GetOnProgressChanged_Lcom_oze_music_musicbar_MusicBar_IZHandler:Oze.Music.MusicBarLib.MusicBar/IOnMusicBarProgressChangeListenerInvoker, MusicBar\n" +
			"n_onStartTrackingTouch:(Lcom/oze/music/musicbar/MusicBar;)V:GetOnStartTrackingTouch_Lcom_oze_music_musicbar_MusicBar_Handler:Oze.Music.MusicBarLib.MusicBar/IOnMusicBarProgressChangeListenerInvoker, MusicBar\n" +
			"n_onStopTrackingTouch:(Lcom/oze/music/musicbar/MusicBar;)V:GetOnStopTrackingTouch_Lcom_oze_music_musicbar_MusicBar_Handler:Oze.Music.MusicBarLib.MusicBar/IOnMusicBarProgressChangeListenerInvoker, MusicBar\n" +
			"";
		mono.android.Runtime.register ("Xyzu.Views.NowPlaying.NowPlayingView, Xyzu.Droid", NowPlayingView.class, __md_methods);
	}


	public NowPlayingView (android.content.Context p0)
	{
		super (p0);
		if (getClass () == NowPlayingView.class)
			mono.android.TypeManager.Activate ("Xyzu.Views.NowPlaying.NowPlayingView, Xyzu.Droid", "Android.Content.Context, Mono.Android", this, new java.lang.Object[] { p0 });
	}


	public NowPlayingView (android.content.Context p0, android.util.AttributeSet p1)
	{
		super (p0, p1);
		if (getClass () == NowPlayingView.class)
			mono.android.TypeManager.Activate ("Xyzu.Views.NowPlaying.NowPlayingView, Xyzu.Droid", "Android.Content.Context, Mono.Android:Android.Util.IAttributeSet, Mono.Android", this, new java.lang.Object[] { p0, p1 });
	}


	public NowPlayingView (android.content.Context p0, android.util.AttributeSet p1, int p2)
	{
		super (p0, p1, p2);
		if (getClass () == NowPlayingView.class)
			mono.android.TypeManager.Activate ("Xyzu.Views.NowPlaying.NowPlayingView, Xyzu.Droid", "Android.Content.Context, Mono.Android:Android.Util.IAttributeSet, Mono.Android:System.Int32, mscorlib", this, new java.lang.Object[] { p0, p1, p2 });
	}


	public void onAttachedToWindow ()
	{
		n_onAttachedToWindow ();
	}

	private native void n_onAttachedToWindow ();


	public void onDetachedFromWindow ()
	{
		n_onDetachedFromWindow ();
	}

	private native void n_onDetachedFromWindow ();


	public void setTransition (int p0)
	{
		n_setTransition (p0);
	}

	private native void n_setTransition (int p0);


	public void setTransition (int p0, int p1)
	{
		n_setTransition (p0, p1);
	}

	private native void n_setTransition (int p0, int p1);


	public void setTransition (androidx.constraintlayout.motion.widget.MotionScene.Transition p0)
	{
		n_setTransition (p0);
	}

	private native void n_setTransition (androidx.constraintlayout.motion.widget.MotionScene.Transition p0);


	public void onTransitionChange (androidx.constraintlayout.motion.widget.MotionLayout p0, int p1, int p2, float p3)
	{
		n_onTransitionChange (p0, p1, p2, p3);
	}

	private native void n_onTransitionChange (androidx.constraintlayout.motion.widget.MotionLayout p0, int p1, int p2, float p3);


	public void onTransitionCompleted (androidx.constraintlayout.motion.widget.MotionLayout p0, int p1)
	{
		n_onTransitionCompleted (p0, p1);
	}

	private native void n_onTransitionCompleted (androidx.constraintlayout.motion.widget.MotionLayout p0, int p1);


	public void onTransitionStarted (androidx.constraintlayout.motion.widget.MotionLayout p0, int p1, int p2)
	{
		n_onTransitionStarted (p0, p1, p2);
	}

	private native void n_onTransitionStarted (androidx.constraintlayout.motion.widget.MotionLayout p0, int p1, int p2);


	public void onTransitionTrigger (androidx.constraintlayout.motion.widget.MotionLayout p0, int p1, boolean p2, float p3)
	{
		n_onTransitionTrigger (p0, p1, p2, p3);
	}

	private native void n_onTransitionTrigger (androidx.constraintlayout.motion.widget.MotionLayout p0, int p1, boolean p2, float p3);


	public void onProgressChanged (com.oze.music.musicbar.MusicBar p0, int p1, boolean p2)
	{
		n_onProgressChanged (p0, p1, p2);
	}

	private native void n_onProgressChanged (com.oze.music.musicbar.MusicBar p0, int p1, boolean p2);


	public void onStartTrackingTouch (com.oze.music.musicbar.MusicBar p0)
	{
		n_onStartTrackingTouch (p0);
	}

	private native void n_onStartTrackingTouch (com.oze.music.musicbar.MusicBar p0);


	public void onStopTrackingTouch (com.oze.music.musicbar.MusicBar p0)
	{
		n_onStopTrackingTouch (p0);
	}

	private native void n_onStopTrackingTouch (com.oze.music.musicbar.MusicBar p0);

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
