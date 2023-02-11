package xyzu.preference;


public class SeekBarPreference
	extends androidx.preference.SeekBarPreference
	implements
		mono.android.IGCUserPeer
{
/** @hide */
	public static final String __md_methods;
	static {
		__md_methods = 
			"n_getMin:()I:GetGetMinHandler\n" +
			"n_setMin:(I)V:GetSetMin_IHandler\n" +
			"n_getValue:()I:GetGetValueHandler\n" +
			"n_setValue:(I)V:GetSetValue_IHandler\n" +
			"n_onBindViewHolder:(Landroidx/preference/PreferenceViewHolder;)V:GetOnBindViewHolder_Landroidx_preference_PreferenceViewHolder_Handler\n" +
			"";
		mono.android.Runtime.register ("Xyzu.Preference.SeekBarPreference, Xyzu.Droid", SeekBarPreference.class, __md_methods);
	}


	public SeekBarPreference (android.content.Context p0)
	{
		super (p0);
		if (getClass () == SeekBarPreference.class)
			mono.android.TypeManager.Activate ("Xyzu.Preference.SeekBarPreference, Xyzu.Droid", "Android.Content.Context, Mono.Android", this, new java.lang.Object[] { p0 });
	}


	public SeekBarPreference (android.content.Context p0, android.util.AttributeSet p1)
	{
		super (p0, p1);
		if (getClass () == SeekBarPreference.class)
			mono.android.TypeManager.Activate ("Xyzu.Preference.SeekBarPreference, Xyzu.Droid", "Android.Content.Context, Mono.Android:Android.Util.IAttributeSet, Mono.Android", this, new java.lang.Object[] { p0, p1 });
	}


	public SeekBarPreference (android.content.Context p0, android.util.AttributeSet p1, int p2)
	{
		super (p0, p1, p2);
		if (getClass () == SeekBarPreference.class)
			mono.android.TypeManager.Activate ("Xyzu.Preference.SeekBarPreference, Xyzu.Droid", "Android.Content.Context, Mono.Android:Android.Util.IAttributeSet, Mono.Android:System.Int32, mscorlib", this, new java.lang.Object[] { p0, p1, p2 });
	}


	public SeekBarPreference (android.content.Context p0, android.util.AttributeSet p1, int p2, int p3)
	{
		super (p0, p1, p2, p3);
		if (getClass () == SeekBarPreference.class)
			mono.android.TypeManager.Activate ("Xyzu.Preference.SeekBarPreference, Xyzu.Droid", "Android.Content.Context, Mono.Android:Android.Util.IAttributeSet, Mono.Android:System.Int32, mscorlib:System.Int32, mscorlib", this, new java.lang.Object[] { p0, p1, p2, p3 });
	}


	public int getMin ()
	{
		return n_getMin ();
	}

	private native int n_getMin ();


	public void setMin (int p0)
	{
		n_setMin (p0);
	}

	private native void n_setMin (int p0);


	public int getValue ()
	{
		return n_getValue ();
	}

	private native int n_getValue ();


	public void setValue (int p0)
	{
		n_setValue (p0);
	}

	private native void n_setValue (int p0);


	public void onBindViewHolder (androidx.preference.PreferenceViewHolder p0)
	{
		n_onBindViewHolder (p0);
	}

	private native void n_onBindViewHolder (androidx.preference.PreferenceViewHolder p0);

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
