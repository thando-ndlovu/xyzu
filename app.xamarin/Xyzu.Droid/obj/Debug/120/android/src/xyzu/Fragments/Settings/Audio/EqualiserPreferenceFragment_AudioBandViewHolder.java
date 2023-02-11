package Xyzu.Fragments.Settings.Audio;


public class EqualiserPreferenceFragment_AudioBandViewHolder
	extends crc64e2e781ae34281353.RecyclerViewViewHolderDefault
	implements
		mono.android.IGCUserPeer
{
/** @hide */
	public static final String __md_methods;
	static {
		__md_methods = 
			"";
		mono.android.Runtime.register ("Xyzu.Fragments.Settings.Audio.EqualiserPreferenceFragment+AudioBandViewHolder, Xyzu.Droid", EqualiserPreferenceFragment_AudioBandViewHolder.class, __md_methods);
	}


	public EqualiserPreferenceFragment_AudioBandViewHolder (android.view.View p0)
	{
		super (p0);
		if (getClass () == EqualiserPreferenceFragment_AudioBandViewHolder.class)
			mono.android.TypeManager.Activate ("Xyzu.Fragments.Settings.Audio.EqualiserPreferenceFragment+AudioBandViewHolder, Xyzu.Droid", "Android.Views.View, Mono.Android", this, new java.lang.Object[] { p0 });
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
