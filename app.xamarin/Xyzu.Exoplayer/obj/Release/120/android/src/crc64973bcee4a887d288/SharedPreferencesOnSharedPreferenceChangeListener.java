package crc64973bcee4a887d288;


public class SharedPreferencesOnSharedPreferenceChangeListener
	extends java.lang.Object
	implements
		mono.android.IGCUserPeer,
		android.content.SharedPreferences.OnSharedPreferenceChangeListener
{
/** @hide */
	public static final String __md_methods;
	static {
		__md_methods = 
			"n_onSharedPreferenceChanged:(Landroid/content/SharedPreferences;Ljava/lang/String;)V:GetOnSharedPreferenceChanged_Landroid_content_SharedPreferences_Ljava_lang_String_Handler:Android.Content.ISharedPreferencesOnSharedPreferenceChangeListenerInvoker, Mono.Android, Version=0.0.0.0, Culture=neutral, PublicKeyToken=null\n" +
			"";
		mono.android.Runtime.register ("Android.Content.SharedPreferencesOnSharedPreferenceChangeListener, Xyzu.Extensions", SharedPreferencesOnSharedPreferenceChangeListener.class, __md_methods);
	}


	public SharedPreferencesOnSharedPreferenceChangeListener ()
	{
		super ();
		if (getClass () == SharedPreferencesOnSharedPreferenceChangeListener.class)
			mono.android.TypeManager.Activate ("Android.Content.SharedPreferencesOnSharedPreferenceChangeListener, Xyzu.Extensions", "", this, new java.lang.Object[] {  });
	}


	public void onSharedPreferenceChanged (android.content.SharedPreferences p0, java.lang.String p1)
	{
		n_onSharedPreferenceChanged (p0, p1);
	}

	private native void n_onSharedPreferenceChanged (android.content.SharedPreferences p0, java.lang.String p1);

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
