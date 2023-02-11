package crc64f590b0ccef3b739c;


public class PopupMenuDismissListener
	extends java.lang.Object
	implements
		mono.android.IGCUserPeer,
		androidx.appcompat.widget.PopupMenu.OnDismissListener
{
/** @hide */
	public static final String __md_methods;
	static {
		__md_methods = 
			"n_onDismiss:(Landroidx/appcompat/widget/PopupMenu;)V:GetOnDismiss_Landroidx_appcompat_widget_PopupMenu_Handler:AndroidX.AppCompat.Widget.PopupMenu/IOnDismissListenerInvoker, Xamarin.AndroidX.AppCompat\n" +
			"";
		mono.android.Runtime.register ("AndroidX.AppCompat.Widget.PopupMenuDismissListener, Xyzu.Extensions", PopupMenuDismissListener.class, __md_methods);
	}


	public PopupMenuDismissListener ()
	{
		super ();
		if (getClass () == PopupMenuDismissListener.class)
			mono.android.TypeManager.Activate ("AndroidX.AppCompat.Widget.PopupMenuDismissListener, Xyzu.Extensions", "", this, new java.lang.Object[] {  });
	}


	public void onDismiss (androidx.appcompat.widget.PopupMenu p0)
	{
		n_onDismiss (p0);
	}

	private native void n_onDismiss (androidx.appcompat.widget.PopupMenu p0);

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
