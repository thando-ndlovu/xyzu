package Xyzu.Fragments.Settings.Audio;


public class AudioPreferenceFragment
	extends crc64742beef500211ec7.BasePreferenceFragment
	implements
		mono.android.IGCUserPeer
{
/** @hide */
	public static final String __md_methods;
	static {
		__md_methods = 
			"n_onResume:()V:GetOnResumeHandler\n" +
			"n_onCreatePreferences:(Landroid/os/Bundle;Ljava/lang/String;)V:GetOnCreatePreferences_Landroid_os_Bundle_Ljava_lang_String_Handler\n" +
			"";
		mono.android.Runtime.register ("Xyzu.Fragments.Settings.Audio.AudioPreferenceFragment, Xyzu.Droid", AudioPreferenceFragment.class, __md_methods);
	}


	public AudioPreferenceFragment ()
	{
		super ();
		if (getClass () == AudioPreferenceFragment.class)
			mono.android.TypeManager.Activate ("Xyzu.Fragments.Settings.Audio.AudioPreferenceFragment, Xyzu.Droid", "", this, new java.lang.Object[] {  });
	}


	public void onResume ()
	{
		n_onResume ();
	}

	private native void n_onResume ();


	public void onCreatePreferences (android.os.Bundle p0, java.lang.String p1)
	{
		n_onCreatePreferences (p0, p1);
	}

	private native void n_onCreatePreferences (android.os.Bundle p0, java.lang.String p1);

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
