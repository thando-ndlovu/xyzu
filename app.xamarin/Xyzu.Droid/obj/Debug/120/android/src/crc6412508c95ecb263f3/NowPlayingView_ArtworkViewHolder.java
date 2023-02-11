package crc6412508c95ecb263f3;


public class NowPlayingView_ArtworkViewHolder
	extends crc64e2e781ae34281353.RecyclerViewViewHolderDefault
	implements
		mono.android.IGCUserPeer
{
/** @hide */
	public static final String __md_methods;
	static {
		__md_methods = 
			"";
		mono.android.Runtime.register ("Xyzu.Views.NowPlaying.NowPlayingView+ArtworkViewHolder, Xyzu.Droid", NowPlayingView_ArtworkViewHolder.class, __md_methods);
	}


	public NowPlayingView_ArtworkViewHolder (android.view.View p0)
	{
		super (p0);
		if (getClass () == NowPlayingView_ArtworkViewHolder.class)
			mono.android.TypeManager.Activate ("Xyzu.Views.NowPlaying.NowPlayingView+ArtworkViewHolder, Xyzu.Droid", "Android.Views.View, Mono.Android", this, new java.lang.Object[] { p0 });
	}

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
