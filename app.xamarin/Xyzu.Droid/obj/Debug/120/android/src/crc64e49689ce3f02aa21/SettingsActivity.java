package crc64e49689ce3f02aa21;


public class SettingsActivity
	extends crc64e49689ce3f02aa21.BaseActivity
	implements
		mono.android.IGCUserPeer
{
/** @hide */
	public static final String __md_methods;
	static {
		__md_methods = 
			"n_onCreate:(Landroid/os/Bundle;)V:GetOnCreate_Landroid_os_Bundle_Handler\n" +
			"n_onStart:()V:GetOnStartHandler\n" +
			"n_onBackPressed:()V:GetOnBackPressedHandler\n" +
			"";
		mono.android.Runtime.register ("Xyzu.Activities.SettingsActivity, Xyzu.Droid", SettingsActivity.class, __md_methods);
	}


	public SettingsActivity ()
	{
		super ();
		if (getClass () == SettingsActivity.class)
			mono.android.TypeManager.Activate ("Xyzu.Activities.SettingsActivity, Xyzu.Droid", "", this, new java.lang.Object[] {  });
	}


	public SettingsActivity (int p0)
	{
		super (p0);
		if (getClass () == SettingsActivity.class)
			mono.android.TypeManager.Activate ("Xyzu.Activities.SettingsActivity, Xyzu.Droid", "System.Int32, mscorlib", this, new java.lang.Object[] { p0 });
	}


	public void onCreate (android.os.Bundle p0)
	{
		n_onCreate (p0);
	}

	private native void n_onCreate (android.os.Bundle p0);


	public void onStart ()
	{
		n_onStart ();
	}

	private native void n_onStart ();


	public void onBackPressed ()
	{
		n_onBackPressed ();
	}

	private native void n_onBackPressed ();

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
