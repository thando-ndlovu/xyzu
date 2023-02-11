package com.oze.music.musicbar;


public class MusicBar_MusicBarProgressChangeListener
	extends java.lang.Object
	implements
		mono.android.IGCUserPeer,
		com.oze.music.musicbar.MusicBar.OnMusicBarProgressChangeListener
{
/** @hide */
	public static final String __md_methods;
	static {
		__md_methods = 
			"n_onProgressChanged:(Lcom/oze/music/musicbar/MusicBar;IZ)V:GetOnProgressChanged_Lcom_oze_music_musicbar_MusicBar_IZHandler:Oze.Music.MusicBarLib.MusicBar/IOnMusicBarProgressChangeListenerInvoker, MusicBar\n" +
			"n_onStartTrackingTouch:(Lcom/oze/music/musicbar/MusicBar;)V:GetOnStartTrackingTouch_Lcom_oze_music_musicbar_MusicBar_Handler:Oze.Music.MusicBarLib.MusicBar/IOnMusicBarProgressChangeListenerInvoker, MusicBar\n" +
			"n_onStopTrackingTouch:(Lcom/oze/music/musicbar/MusicBar;)V:GetOnStopTrackingTouch_Lcom_oze_music_musicbar_MusicBar_Handler:Oze.Music.MusicBarLib.MusicBar/IOnMusicBarProgressChangeListenerInvoker, MusicBar\n" +
			"";
		mono.android.Runtime.register ("Oze.Music.MusicBarLib.MusicBar+MusicBarProgressChangeListener, MusicBar", MusicBar_MusicBarProgressChangeListener.class, __md_methods);
	}


	public MusicBar_MusicBarProgressChangeListener ()
	{
		super ();
		if (getClass () == MusicBar_MusicBarProgressChangeListener.class)
			mono.android.TypeManager.Activate ("Oze.Music.MusicBarLib.MusicBar+MusicBarProgressChangeListener, MusicBar", "", this, new java.lang.Object[] {  });
	}


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
