package crc64b1d9a73e6dae7b48;


public class LoudnessEnhancerEffect
	extends android.media.audiofx.LoudnessEnhancer
	implements
		mono.android.IGCUserPeer
{
/** @hide */
	public static final String __md_methods;
	static {
		__md_methods = 
			"";
		mono.android.Runtime.register ("Android.Media.Audiofx.LoudnessEnhancerEffect, Xyzu.Extensions", LoudnessEnhancerEffect.class, __md_methods);
	}


	public LoudnessEnhancerEffect (int p0)
	{
		super (p0);
		if (getClass () == LoudnessEnhancerEffect.class)
			mono.android.TypeManager.Activate ("Android.Media.Audiofx.LoudnessEnhancerEffect, Xyzu.Extensions", "System.Int32, mscorlib", this, new java.lang.Object[] { p0 });
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
