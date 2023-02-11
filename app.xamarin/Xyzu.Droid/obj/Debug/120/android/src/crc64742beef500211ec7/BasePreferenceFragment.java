package crc64742beef500211ec7;


public abstract class BasePreferenceFragment
	extends androidx.preference.PreferenceFragmentCompat
	implements
		mono.android.IGCUserPeer,
		androidx.preference.Preference.OnPreferenceChangeListener
{
/** @hide */
	public static final String __md_methods;
	static {
		__md_methods = 
			"n_onCreateView:(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;:GetOnCreateView_Landroid_view_LayoutInflater_Landroid_view_ViewGroup_Landroid_os_Bundle_Handler\n" +
			"n_onPreferenceChange:(Landroidx/preference/Preference;Ljava/lang/Object;)Z:GetOnPreferenceChange_Landroidx_preference_Preference_Ljava_lang_Object_Handler:AndroidX.Preference.Preference/IOnPreferenceChangeListenerInvoker, Xamarin.AndroidX.Preference\n" +
			"";
		mono.android.Runtime.register ("Xyzu.Fragments.Settings.BasePreferenceFragment, Xyzu.Droid", BasePreferenceFragment.class, __md_methods);
	}


	public BasePreferenceFragment ()
	{
		super ();
		if (getClass () == BasePreferenceFragment.class)
			mono.android.TypeManager.Activate ("Xyzu.Fragments.Settings.BasePreferenceFragment, Xyzu.Droid", "", this, new java.lang.Object[] {  });
	}


	public android.view.View onCreateView (android.view.LayoutInflater p0, android.view.ViewGroup p1, android.os.Bundle p2)
	{
		return n_onCreateView (p0, p1, p2);
	}

	private native android.view.View n_onCreateView (android.view.LayoutInflater p0, android.view.ViewGroup p1, android.os.Bundle p2);


	public boolean onPreferenceChange (androidx.preference.Preference p0, java.lang.Object p1)
	{
		return n_onPreferenceChange (p0, p1);
	}

	private native boolean n_onPreferenceChange (androidx.preference.Preference p0, java.lang.Object p1);

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
