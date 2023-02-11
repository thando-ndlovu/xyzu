package crc64e49689ce3f02aa21;


public class LibraryActivityTabLayout
	extends crc64e49689ce3f02aa21.LibraryActivity
	implements
		mono.android.IGCUserPeer
{
/** @hide */
	public static final String __md_methods;
	static {
		__md_methods = 
			"n_onBackPressed:()V:GetOnBackPressedHandler\n" +
			"n_onCreateOptionsMenu:(Landroid/view/Menu;)Z:GetOnCreateOptionsMenu_Landroid_view_Menu_Handler\n" +
			"n_onOptionsItemSelected:(Landroid/view/MenuItem;)Z:GetOnOptionsItemSelected_Landroid_view_MenuItem_Handler\n" +
			"n_onCreate:(Landroid/os/Bundle;)V:GetOnCreate_Landroid_os_Bundle_Handler\n" +
			"n_onStart:()V:GetOnStartHandler\n" +
			"n_onStop:()V:GetOnStopHandler\n" +
			"";
		mono.android.Runtime.register ("Xyzu.Activities.LibraryActivityTabLayout, Xyzu.Droid", LibraryActivityTabLayout.class, __md_methods);
	}


	public LibraryActivityTabLayout ()
	{
		super ();
		if (getClass () == LibraryActivityTabLayout.class)
			mono.android.TypeManager.Activate ("Xyzu.Activities.LibraryActivityTabLayout, Xyzu.Droid", "", this, new java.lang.Object[] {  });
	}


	public LibraryActivityTabLayout (int p0)
	{
		super (p0);
		if (getClass () == LibraryActivityTabLayout.class)
			mono.android.TypeManager.Activate ("Xyzu.Activities.LibraryActivityTabLayout, Xyzu.Droid", "System.Int32, mscorlib", this, new java.lang.Object[] { p0 });
	}


	public void onBackPressed ()
	{
		n_onBackPressed ();
	}

	private native void n_onBackPressed ();


	public boolean onCreateOptionsMenu (android.view.Menu p0)
	{
		return n_onCreateOptionsMenu (p0);
	}

	private native boolean n_onCreateOptionsMenu (android.view.Menu p0);


	public boolean onOptionsItemSelected (android.view.MenuItem p0)
	{
		return n_onOptionsItemSelected (p0);
	}

	private native boolean n_onOptionsItemSelected (android.view.MenuItem p0);


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


	public void onStop ()
	{
		n_onStop ();
	}

	private native void n_onStop ();

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
