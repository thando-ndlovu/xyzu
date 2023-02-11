package crc6412508c95ecb263f3;


public class NowPlayingView_ArtworkOnScrollListener
	extends androidx.recyclerview.widget.RecyclerView.OnScrollListener
	implements
		mono.android.IGCUserPeer
{
/** @hide */
	public static final String __md_methods;
	static {
		__md_methods = 
			"n_onScrolled:(Landroidx/recyclerview/widget/RecyclerView;II)V:GetOnScrolled_Landroidx_recyclerview_widget_RecyclerView_IIHandler\n" +
			"n_onScrollStateChanged:(Landroidx/recyclerview/widget/RecyclerView;I)V:GetOnScrollStateChanged_Landroidx_recyclerview_widget_RecyclerView_IHandler\n" +
			"";
		mono.android.Runtime.register ("Xyzu.Views.NowPlaying.NowPlayingView+ArtworkOnScrollListener, Xyzu.Droid", NowPlayingView_ArtworkOnScrollListener.class, __md_methods);
	}


	public NowPlayingView_ArtworkOnScrollListener ()
	{
		super ();
		if (getClass () == NowPlayingView_ArtworkOnScrollListener.class)
			mono.android.TypeManager.Activate ("Xyzu.Views.NowPlaying.NowPlayingView+ArtworkOnScrollListener, Xyzu.Droid", "", this, new java.lang.Object[] {  });
	}

	public NowPlayingView_ArtworkOnScrollListener (crc6412508c95ecb263f3.NowPlayingView p0)
	{
		super ();
		if (getClass () == NowPlayingView_ArtworkOnScrollListener.class)
			mono.android.TypeManager.Activate ("Xyzu.Views.NowPlaying.NowPlayingView+ArtworkOnScrollListener, Xyzu.Droid", "Xyzu.Views.NowPlaying.NowPlayingView, Xyzu.Droid", this, new java.lang.Object[] { p0 });
	}


	public void onScrolled (androidx.recyclerview.widget.RecyclerView p0, int p1, int p2)
	{
		n_onScrolled (p0, p1, p2);
	}

	private native void n_onScrolled (androidx.recyclerview.widget.RecyclerView p0, int p1, int p2);


	public void onScrollStateChanged (androidx.recyclerview.widget.RecyclerView p0, int p1)
	{
		n_onScrollStateChanged (p0, p1);
	}

	private native void n_onScrollStateChanged (androidx.recyclerview.widget.RecyclerView p0, int p1);

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
