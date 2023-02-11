package crc64f1e99d3ab2d2dd53;


public class LibraryFragment
	extends androidx.fragment.app.Fragment
	implements
		mono.android.IGCUserPeer,
		androidx.appcompat.widget.Toolbar.OnMenuItemClickListener,
		android.content.DialogInterface.OnShowListener,
		android.content.DialogInterface.OnDismissListener
{
/** @hide */
	public static final String __md_methods;
	static {
		__md_methods = 
			"n_onMenuItemClick:(Landroid/view/MenuItem;)Z:GetOnMenuItemClick_Landroid_view_MenuItem_Handler:AndroidX.AppCompat.Widget.Toolbar/IOnMenuItemClickListenerInvoker, Xamarin.AndroidX.AppCompat\n" +
			"n_onShow:(Landroid/content/DialogInterface;)V:GetOnShow_Landroid_content_DialogInterface_Handler:Android.Content.IDialogInterfaceOnShowListenerInvoker, Mono.Android, Version=0.0.0.0, Culture=neutral, PublicKeyToken=null\n" +
			"n_onDismiss:(Landroid/content/DialogInterface;)V:GetOnDismiss_Landroid_content_DialogInterface_Handler:Android.Content.IDialogInterfaceOnDismissListenerInvoker, Mono.Android, Version=0.0.0.0, Culture=neutral, PublicKeyToken=null\n" +
			"";
		mono.android.Runtime.register ("Xyzu.Fragments.Library.LibraryFragment, Xyzu.Droid", LibraryFragment.class, __md_methods);
	}


	public LibraryFragment ()
	{
		super ();
		if (getClass () == LibraryFragment.class)
			mono.android.TypeManager.Activate ("Xyzu.Fragments.Library.LibraryFragment, Xyzu.Droid", "", this, new java.lang.Object[] {  });
	}


	public LibraryFragment (int p0)
	{
		super (p0);
		if (getClass () == LibraryFragment.class)
			mono.android.TypeManager.Activate ("Xyzu.Fragments.Library.LibraryFragment, Xyzu.Droid", "System.Int32, mscorlib", this, new java.lang.Object[] { p0 });
	}


	public boolean onMenuItemClick (android.view.MenuItem p0)
	{
		return n_onMenuItemClick (p0);
	}

	private native boolean n_onMenuItemClick (android.view.MenuItem p0);


	public void onShow (android.content.DialogInterface p0)
	{
		n_onShow (p0);
	}

	private native void n_onShow (android.content.DialogInterface p0);


	public void onDismiss (android.content.DialogInterface p0)
	{
		n_onDismiss (p0);
	}

	private native void n_onDismiss (android.content.DialogInterface p0);

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
