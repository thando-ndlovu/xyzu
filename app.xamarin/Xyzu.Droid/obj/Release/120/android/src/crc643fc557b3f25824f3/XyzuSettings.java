package crc643fc557b3f25824f3;


public class XyzuSettings
	extends java.lang.Object
	implements
		mono.android.IGCUserPeer,
		android.content.SharedPreferences
{
/** @hide */
	public static final String __md_methods;
	static {
		__md_methods = 
			"n_getAll:()Ljava/util/Map;:GetGetAllHandler:Android.Content.ISharedPreferencesInvoker, Mono.Android, Version=0.0.0.0, Culture=neutral, PublicKeyToken=null\n" +
			"n_contains:(Ljava/lang/String;)Z:GetContains_Ljava_lang_String_Handler:Android.Content.ISharedPreferencesInvoker, Mono.Android, Version=0.0.0.0, Culture=neutral, PublicKeyToken=null\n" +
			"n_edit:()Landroid/content/SharedPreferences$Editor;:GetEditHandler:Android.Content.ISharedPreferencesInvoker, Mono.Android, Version=0.0.0.0, Culture=neutral, PublicKeyToken=null\n" +
			"n_getBoolean:(Ljava/lang/String;Z)Z:GetGetBoolean_Ljava_lang_String_ZHandler:Android.Content.ISharedPreferencesInvoker, Mono.Android, Version=0.0.0.0, Culture=neutral, PublicKeyToken=null\n" +
			"n_getFloat:(Ljava/lang/String;F)F:GetGetFloat_Ljava_lang_String_FHandler:Android.Content.ISharedPreferencesInvoker, Mono.Android, Version=0.0.0.0, Culture=neutral, PublicKeyToken=null\n" +
			"n_getInt:(Ljava/lang/String;I)I:GetGetInt_Ljava_lang_String_IHandler:Android.Content.ISharedPreferencesInvoker, Mono.Android, Version=0.0.0.0, Culture=neutral, PublicKeyToken=null\n" +
			"n_getLong:(Ljava/lang/String;J)J:GetGetLong_Ljava_lang_String_JHandler:Android.Content.ISharedPreferencesInvoker, Mono.Android, Version=0.0.0.0, Culture=neutral, PublicKeyToken=null\n" +
			"n_getString:(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;:GetGetString_Ljava_lang_String_Ljava_lang_String_Handler:Android.Content.ISharedPreferencesInvoker, Mono.Android, Version=0.0.0.0, Culture=neutral, PublicKeyToken=null\n" +
			"n_getStringSet:(Ljava/lang/String;Ljava/util/Set;)Ljava/util/Set;:GetGetStringSet_Ljava_lang_String_Ljava_util_Set_Handler:Android.Content.ISharedPreferencesInvoker, Mono.Android, Version=0.0.0.0, Culture=neutral, PublicKeyToken=null\n" +
			"n_registerOnSharedPreferenceChangeListener:(Landroid/content/SharedPreferences$OnSharedPreferenceChangeListener;)V:GetRegisterOnSharedPreferenceChangeListener_Landroid_content_SharedPreferences_OnSharedPreferenceChangeListener_Handler:Android.Content.ISharedPreferencesInvoker, Mono.Android, Version=0.0.0.0, Culture=neutral, PublicKeyToken=null\n" +
			"n_unregisterOnSharedPreferenceChangeListener:(Landroid/content/SharedPreferences$OnSharedPreferenceChangeListener;)V:GetUnregisterOnSharedPreferenceChangeListener_Landroid_content_SharedPreferences_OnSharedPreferenceChangeListener_Handler:Android.Content.ISharedPreferencesInvoker, Mono.Android, Version=0.0.0.0, Culture=neutral, PublicKeyToken=null\n" +
			"";
		mono.android.Runtime.register ("Xyzu.XyzuSettings, Xyzu.Droid", XyzuSettings.class, __md_methods);
	}


	public XyzuSettings ()
	{
		super ();
		if (getClass () == XyzuSettings.class)
			mono.android.TypeManager.Activate ("Xyzu.XyzuSettings, Xyzu.Droid", "", this, new java.lang.Object[] {  });
	}

	public XyzuSettings (android.content.Context p0)
	{
		super ();
		if (getClass () == XyzuSettings.class)
			mono.android.TypeManager.Activate ("Xyzu.XyzuSettings, Xyzu.Droid", "Android.Content.Context, Mono.Android", this, new java.lang.Object[] { p0 });
	}


	public java.util.Map getAll ()
	{
		return n_getAll ();
	}

	private native java.util.Map n_getAll ();


	public boolean contains (java.lang.String p0)
	{
		return n_contains (p0);
	}

	private native boolean n_contains (java.lang.String p0);


	public android.content.SharedPreferences.Editor edit ()
	{
		return n_edit ();
	}

	private native android.content.SharedPreferences.Editor n_edit ();


	public boolean getBoolean (java.lang.String p0, boolean p1)
	{
		return n_getBoolean (p0, p1);
	}

	private native boolean n_getBoolean (java.lang.String p0, boolean p1);


	public float getFloat (java.lang.String p0, float p1)
	{
		return n_getFloat (p0, p1);
	}

	private native float n_getFloat (java.lang.String p0, float p1);


	public int getInt (java.lang.String p0, int p1)
	{
		return n_getInt (p0, p1);
	}

	private native int n_getInt (java.lang.String p0, int p1);


	public long getLong (java.lang.String p0, long p1)
	{
		return n_getLong (p0, p1);
	}

	private native long n_getLong (java.lang.String p0, long p1);


	public java.lang.String getString (java.lang.String p0, java.lang.String p1)
	{
		return n_getString (p0, p1);
	}

	private native java.lang.String n_getString (java.lang.String p0, java.lang.String p1);


	public java.util.Set getStringSet (java.lang.String p0, java.util.Set p1)
	{
		return n_getStringSet (p0, p1);
	}

	private native java.util.Set n_getStringSet (java.lang.String p0, java.util.Set p1);


	public void registerOnSharedPreferenceChangeListener (android.content.SharedPreferences.OnSharedPreferenceChangeListener p0)
	{
		n_registerOnSharedPreferenceChangeListener (p0);
	}

	private native void n_registerOnSharedPreferenceChangeListener (android.content.SharedPreferences.OnSharedPreferenceChangeListener p0);


	public void unregisterOnSharedPreferenceChangeListener (android.content.SharedPreferences.OnSharedPreferenceChangeListener p0)
	{
		n_unregisterOnSharedPreferenceChangeListener (p0);
	}

	private native void n_unregisterOnSharedPreferenceChangeListener (android.content.SharedPreferences.OnSharedPreferenceChangeListener p0);

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
