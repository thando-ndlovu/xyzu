package xyzu.preference;


public class ListPreference
	extends androidx.preference.ListPreference
	implements
		mono.android.IGCUserPeer
{
/** @hide */
	public static final String __md_methods;
	static {
		__md_methods = 
			"n_onClick:()V:GetOnClickHandler\n" +
			"n_setValueIndex:(I)V:GetSetValueIndex_IHandler\n" +
			"n_onBindViewHolder:(Landroidx/preference/PreferenceViewHolder;)V:GetOnBindViewHolder_Landroidx_preference_PreferenceViewHolder_Handler\n" +
			"";
		mono.android.Runtime.register ("Xyzu.Preference.ListPreference, Xyzu.Droid", ListPreference.class, __md_methods);
	}


	public ListPreference (android.content.Context p0)
	{
		super (p0);
		if (getClass () == ListPreference.class)
			mono.android.TypeManager.Activate ("Xyzu.Preference.ListPreference, Xyzu.Droid", "Android.Content.Context, Mono.Android", this, new java.lang.Object[] { p0 });
	}


	public ListPreference (android.content.Context p0, android.util.AttributeSet p1)
	{
		super (p0, p1);
		if (getClass () == ListPreference.class)
			mono.android.TypeManager.Activate ("Xyzu.Preference.ListPreference, Xyzu.Droid", "Android.Content.Context, Mono.Android:Android.Util.IAttributeSet, Mono.Android", this, new java.lang.Object[] { p0, p1 });
	}


	public ListPreference (android.content.Context p0, android.util.AttributeSet p1, int p2)
	{
		super (p0, p1, p2);
		if (getClass () == ListPreference.class)
			mono.android.TypeManager.Activate ("Xyzu.Preference.ListPreference, Xyzu.Droid", "Android.Content.Context, Mono.Android:Android.Util.IAttributeSet, Mono.Android:System.Int32, mscorlib", this, new java.lang.Object[] { p0, p1, p2 });
	}


	public ListPreference (android.content.Context p0, android.util.AttributeSet p1, int p2, int p3)
	{
		super (p0, p1, p2, p3);
		if (getClass () == ListPreference.class)
			mono.android.TypeManager.Activate ("Xyzu.Preference.ListPreference, Xyzu.Droid", "Android.Content.Context, Mono.Android:Android.Util.IAttributeSet, Mono.Android:System.Int32, mscorlib:System.Int32, mscorlib", this, new java.lang.Object[] { p0, p1, p2, p3 });
	}


	public void onClick ()
	{
		n_onClick ();
	}

	private native void n_onClick ();


	public void setValueIndex (int p0)
	{
		n_setValueIndex (p0);
	}

	private native void n_setValueIndex (int p0);


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
