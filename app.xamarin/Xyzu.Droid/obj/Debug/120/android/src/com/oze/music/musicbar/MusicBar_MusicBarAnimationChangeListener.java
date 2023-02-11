package com.oze.music.musicbar;


public class MusicBar_MusicBarAnimationChangeListener
	extends java.lang.Object
	implements
		mono.android.IGCUserPeer,
		com.oze.music.musicbar.MusicBar.OnMusicBarAnimationChangeListener
{
/** @hide */
	public static final String __md_methods;
	static {
		__md_methods = 
			"n_onHideAnimationEnd:()V:GetOnHideAnimationEndHandler:Oze.Music.MusicBarLib.MusicBar/IOnMusicBarAnimationChangeListenerInvoker, MusicBar\n" +
			"n_onHideAnimationStart:()V:GetOnHideAnimationStartHandler:Oze.Music.MusicBarLib.MusicBar/IOnMusicBarAnimationChangeListenerInvoker, MusicBar\n" +
			"n_onShowAnimationEnd:()V:GetOnShowAnimationEndHandler:Oze.Music.MusicBarLib.MusicBar/IOnMusicBarAnimationChangeListenerInvoker, MusicBar\n" +
			"n_onShowAnimationStart:()V:GetOnShowAnimationStartHandler:Oze.Music.MusicBarLib.MusicBar/IOnMusicBarAnimationChangeListenerInvoker, MusicBar\n" +
			"";
		mono.android.Runtime.register ("Oze.Music.MusicBarLib.MusicBar+MusicBarAnimationChangeListener, MusicBar", MusicBar_MusicBarAnimationChangeListener.class, __md_methods);
	}


	public MusicBar_MusicBarAnimationChangeListener ()
	{
		super ();
		if (getClass () == MusicBar_MusicBarAnimationChangeListener.class)
			mono.android.TypeManager.Activate ("Oze.Music.MusicBarLib.MusicBar+MusicBarAnimationChangeListener, MusicBar", "", this, new java.lang.Object[] {  });
	}


	public void onHideAnimationEnd ()
	{
		n_onHideAnimationEnd ();
	}

	private native void n_onHideAnimationEnd ();


	public void onHideAnimationStart ()
	{
		n_onHideAnimationStart ();
	}

	private native void n_onHideAnimationStart ();


	public void onShowAnimationEnd ()
	{
		n_onShowAnimationEnd ();
	}

	private native void n_onShowAnimationEnd ();


	public void onShowAnimationStart ()
	{
		n_onShowAnimationStart ();
	}

	private native void n_onShowAnimationStart ();

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
