package crc64e49689ce3f02aa21;


public class LibraryActivityTabLayout_TabLayoutFragmentAdapter
	extends androidx.viewpager2.adapter.FragmentStateAdapter
	implements
		mono.android.IGCUserPeer,
		com.google.android.material.tabs.TabLayoutMediator.TabConfigurationStrategy
{
/** @hide */
	public static final String __md_methods;
	static {
		__md_methods = 
			"n_getItemCount:()I:GetGetItemCountHandler\n" +
			"n_createFragment:(I)Landroidx/fragment/app/Fragment;:GetCreateFragment_IHandler\n" +
			"n_onConfigureTab:(Lcom/google/android/material/tabs/TabLayout$Tab;I)V:GetOnConfigureTab_Lcom_google_android_material_tabs_TabLayout_Tab_IHandler:Google.Android.Material.Tabs.TabLayoutMediator/ITabConfigurationStrategyInvoker, Xamarin.Google.Android.Material\n" +
			"";
		mono.android.Runtime.register ("Xyzu.Activities.LibraryActivityTabLayout+TabLayoutFragmentAdapter, Xyzu.Droid", LibraryActivityTabLayout_TabLayoutFragmentAdapter.class, __md_methods);
	}


	public LibraryActivityTabLayout_TabLayoutFragmentAdapter (androidx.fragment.app.Fragment p0)
	{
		super (p0);
		if (getClass () == LibraryActivityTabLayout_TabLayoutFragmentAdapter.class)
			mono.android.TypeManager.Activate ("Xyzu.Activities.LibraryActivityTabLayout+TabLayoutFragmentAdapter, Xyzu.Droid", "AndroidX.Fragment.App.Fragment, Xamarin.AndroidX.Fragment", this, new java.lang.Object[] { p0 });
	}


	public LibraryActivityTabLayout_TabLayoutFragmentAdapter (androidx.fragment.app.FragmentActivity p0)
	{
		super (p0);
		if (getClass () == LibraryActivityTabLayout_TabLayoutFragmentAdapter.class)
			mono.android.TypeManager.Activate ("Xyzu.Activities.LibraryActivityTabLayout+TabLayoutFragmentAdapter, Xyzu.Droid", "AndroidX.Fragment.App.FragmentActivity, Xamarin.AndroidX.Fragment", this, new java.lang.Object[] { p0 });
	}


	public LibraryActivityTabLayout_TabLayoutFragmentAdapter (androidx.fragment.app.FragmentManager p0, androidx.lifecycle.Lifecycle p1)
	{
		super (p0, p1);
		if (getClass () == LibraryActivityTabLayout_TabLayoutFragmentAdapter.class)
			mono.android.TypeManager.Activate ("Xyzu.Activities.LibraryActivityTabLayout+TabLayoutFragmentAdapter, Xyzu.Droid", "AndroidX.Fragment.App.FragmentManager, Xamarin.AndroidX.Fragment:AndroidX.Lifecycle.Lifecycle, Xamarin.AndroidX.Lifecycle.Common", this, new java.lang.Object[] { p0, p1 });
	}


	public int getItemCount ()
	{
		return n_getItemCount ();
	}

	private native int n_getItemCount ();


	public androidx.fragment.app.Fragment createFragment (int p0)
	{
		return n_createFragment (p0);
	}

	private native androidx.fragment.app.Fragment n_createFragment (int p0);


	public void onConfigureTab (com.google.android.material.tabs.TabLayout.Tab p0, int p1)
	{
		n_onConfigureTab (p0, p1);
	}

	private native void n_onConfigureTab (com.google.android.material.tabs.TabLayout.Tab p0, int p1);

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
