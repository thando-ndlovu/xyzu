package com.xyclonedesigns.xyzu;


public class scannerservice_ServiceBinder
	extends android.os.Binder
	implements
		mono.android.IGCUserPeer
{
/** @hide */
	public static final String __md_methods;
	static {
		__md_methods = 
			"";
		mono.android.Runtime.register ("Xyzu.XyzuLibrary+ScannerService+ServiceBinder, Xyzu.Droid", scannerservice_ServiceBinder.class, __md_methods);
	}


	public scannerservice_ServiceBinder ()
	{
		super ();
		if (getClass () == scannerservice_ServiceBinder.class)
			mono.android.TypeManager.Activate ("Xyzu.XyzuLibrary+ScannerService+ServiceBinder, Xyzu.Droid", "", this, new java.lang.Object[] {  });
	}


	public scannerservice_ServiceBinder (java.lang.String p0)
	{
		super (p0);
		if (getClass () == scannerservice_ServiceBinder.class)
			mono.android.TypeManager.Activate ("Xyzu.XyzuLibrary+ScannerService+ServiceBinder, Xyzu.Droid", "System.String, mscorlib", this, new java.lang.Object[] { p0 });
	}

	public scannerservice_ServiceBinder (com.xyclonedesigns.xyzu.scannerservice p0)
	{
		super ();
		if (getClass () == scannerservice_ServiceBinder.class)
			mono.android.TypeManager.Activate ("Xyzu.XyzuLibrary+ScannerService+ServiceBinder, Xyzu.Droid", "Xyzu.XyzuLibrary+ScannerService, Xyzu.Droid", this, new java.lang.Object[] { p0 });
	}

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
