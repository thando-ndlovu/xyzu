package crc64e49689ce3f02aa21;


public class LibraryActivity
	extends crc64e49689ce3f02aa21.BaseActivity
	implements
		mono.android.IGCUserPeer,
		androidx.swiperefreshlayout.widget.SwipeRefreshLayout.OnRefreshListener
{
/** @hide */
	public static final String __md_methods;
	static {
		__md_methods = 
			"n_onResume:()V:GetOnResumeHandler\n" +
			"n_onPause:()V:GetOnPauseHandler\n" +
			"n_onBackPressed:()V:GetOnBackPressedHandler\n" +
			"n_onOptionsItemSelected:(Landroid/view/MenuItem;)Z:GetOnOptionsItemSelected_Landroid_view_MenuItem_Handler\n" +
			"n_onRefresh:()V:GetOnRefreshHandler:AndroidX.SwipeRefreshLayout.Widget.SwipeRefreshLayout/IOnRefreshListenerInvoker, Xamarin.AndroidX.SwipeRefreshLayout\n" +
			"";
		mono.android.Runtime.register ("Xyzu.Activities.LibraryActivity, Xyzu.Droid", LibraryActivity.class, __md_methods);
	}


	public LibraryActivity ()
	{
		super ();
		if (getClass () == LibraryActivity.class)
			mono.android.TypeManager.Activate ("Xyzu.Activities.LibraryActivity, Xyzu.Droid", "", this, new java.lang.Object[] {  });
	}


	public LibraryActivity (int p0)
	{
		super (p0);
		if (getClass () == LibraryActivity.class)
			mono.android.TypeManager.Activate ("Xyzu.Activities.LibraryActivity, Xyzu.Droid", "System.Int32, mscorlib", this, new java.lang.Object[] { p0 });
	}


	public void onResume ()
	{
		n_onResume ();
	}

	private native void n_onResume ();


	public void onPause ()
	{
		n_onPause ();
	}

	private native void n_onPause ();


	public void onBackPressed ()
	{
		n_onBackPressed ();
	}

	private native void n_onBackPressed ();


	public boolean onOptionsItemSelected (android.view.MenuItem p0)
	{
		return n_onOptionsItemSelected (p0);
	}

	private native boolean n_onOptionsItemSelected (android.view.MenuItem p0);


	public void onRefresh ()
	{
		n_onRefresh ();
	}

	private native void n_onRefresh ();

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
