#nullable enable

using Android.Content;
using Android.Runtime;
using Android.Util;
using Android.Views;
using AndroidX.RecyclerView.Widget;

using System;

using Xyzu.Droid;

namespace Xyzu.Widgets.RecyclerViews
{
	public abstract class SimpleRecyclerView : RecyclerView
	{
		public SimpleRecyclerView(Context context) : this(context, null!)
		{ }
		public SimpleRecyclerView(Context context, IAttributeSet attrs) : this(context, attrs, Resource.Style.Xyzu_Widget_RecyclerView_Simple)
		{ }
		public SimpleRecyclerView(Context context, IAttributeSet attrs, int defStyleRef) : base(context, attrs, defStyleRef)
		{
			SetAdapter(_SimpleAdapter = new Adapter(context, () => -1));
			AddItemDecoration(_SimpleMarginItemDecoration = new MarginItemDecoration
			{
				MarginRes = Resource.Dimension.dp4
			});
		}

		private Adapter _SimpleAdapter;
		public MarginItemDecoration _SimpleMarginItemDecoration;

		public Adapter SimpleAdapter
		{
			set => SetAdapter(_SimpleAdapter = value);
			get => GetAdapter() as Adapter ?? _SimpleAdapter;
		}
		public MarginItemDecoration SimpleMarginItemDecoration
		{
			get => _SimpleMarginItemDecoration;
			protected set => _SimpleMarginItemDecoration = value; 
		}

		public new class Adapter : RecyclerView.Adapter
		{
			public Adapter(Context context, Func<int> itemCount)
			{
				Context = context;
				GetItemCount = itemCount;
			}

			public Context Context { get; set; }
			public RecyclerView? Parent { get; set; }
			public Func<int> GetItemCount { get; set; }
			public Action<RecyclerViewViewHolderDefault, int>? ViewHolderOnBind { get; set; }
			public Func<ViewGroup, int, RecyclerViewViewHolderDefault>? ViewHolderOnCreate { get; set; }
			public Action<RecyclerViewViewHolderDefault.ViewHolderEventArgs>? ViewHolderOnCheckChange { get; set; }
			public Action<RecyclerViewViewHolderDefault.ViewHolderEventArgs>? ViewHolderOnClick { get; set; }
			public Action<RecyclerViewViewHolderDefault.ViewHolderEventArgs>? ViewHolderOnLongClick { get; set; }

			public override int ItemCount
			{
				get => GetItemCount.Invoke();
			}
			public override void OnViewAttachedToWindow(Java.Lang.Object holder)
			{
				base.OnViewAttachedToWindow(holder);

				RecyclerViewViewHolderDefault viewholder = (RecyclerViewViewHolderDefault)holder;

				viewholder.OnCheckedChange += ViewHolder_OnCheckChange;
				viewholder.OnClick += ViewHolder_OnClick;
				viewholder.OnLongClick += ViewHolder_OnLongClick;
			}
			public override void OnViewDetachedFromWindow(Java.Lang.Object holder)
			{
				base.OnViewDetachedFromWindow(holder);

				RecyclerViewViewHolderDefault viewholder = (RecyclerViewViewHolderDefault)holder;

				viewholder.OnCheckedChange -= ViewHolder_OnCheckChange;
				viewholder.OnClick -= ViewHolder_OnClick;
				viewholder.OnLongClick -= ViewHolder_OnLongClick;
			}
			public override void OnBindViewHolder(ViewHolder holder, int position)
			{
				ViewHolderOnBind?.Invoke((RecyclerViewViewHolderDefault)holder, position);
			}
			public override ViewHolder OnCreateViewHolder(ViewGroup parent, int viewType)
			{
				return ViewHolderOnCreate?.Invoke(parent, viewType) ?? new RecyclerViewViewHolderDefault(new View(Context) { });
			}

			private void ViewHolder_OnCheckChange(object sender, RecyclerViewViewHolderDefault.ViewHolderEventArgs args)
			{
				ViewHolderOnCheckChange?.Invoke(args);
			}
			private void ViewHolder_OnClick(object sender, RecyclerViewViewHolderDefault.ViewHolderEventArgs args)
			{
				ViewHolderOnClick?.Invoke(args);
			}
			private void ViewHolder_OnLongClick(object sender, RecyclerViewViewHolderDefault.ViewHolderEventArgs args)
			{
				ViewHolderOnLongClick?.Invoke(args);
			}
		}
	}

	[Register("xyzu/widgets/recyclerviews/SimpleHorizontalRecyclerView")]
	public class SimpleHorizontalRecyclerView : SimpleRecyclerView
	{
		public SimpleHorizontalRecyclerView(Context context) : this(context, null!)
		{ }
		public SimpleHorizontalRecyclerView(Context context, IAttributeSet attrs) : this(context, attrs, Resource.Style.Xyzu_Widget_RecyclerView_Simple_Horizontal)
		{ }
		public SimpleHorizontalRecyclerView(Context context, IAttributeSet attrs, int defStyleRef) : base(context, attrs, defStyleRef)
		{
			SetLayoutManager(_SimpleLayoutManager = new LayoutManager(context));
		}

		private LayoutManager _SimpleLayoutManager;

		public LayoutManager SimpleLayoutManager
		{
			set => SetLayoutManager(_SimpleLayoutManager = value);
			get => GetLayoutManager() as LayoutManager ?? _SimpleLayoutManager;
		}

		public new class LayoutManager : GridLayoutManager
		{
			public LayoutManager(Context context, IAttributeSet attrs, int defStyleAttr, int defStyleRes) : base(context, attrs, defStyleAttr, defStyleRes)
			{ }
			public LayoutManager(Context context, int spanCount = 1, int orientation = Horizontal, bool reverseLayout = false) : base(context, spanCount, orientation, reverseLayout)
			{ }

			public override void OnLayoutChildren(Recycler? recycler, State? state)
			{
				try { base.OnLayoutChildren(recycler, state); }
				catch (Java.Lang.IndexOutOfBoundsException)
				{
					// IndexOutOfBoundsException Exception on sucessive list refreshes 
					// https://stackoverflow.com/questions/31759171/recyclerview-and-java-lang-indexoutofboundsexception-inconsistency-detected-in
				}
			}
		}
	}

	[Register("xyzu/widgets/recyclerviews/SimpleVerticalRecyclerView")]
	public class SimpleVerticalRecyclerView : SimpleRecyclerView
	{
		public SimpleVerticalRecyclerView(Context context) : this(context, null!)
		{ }
		public SimpleVerticalRecyclerView(Context context, IAttributeSet attrs) : this(context, attrs, Resource.Style.Xyzu_Widget_RecyclerView_Simple_Vertical)
		{ }
		public SimpleVerticalRecyclerView(Context context, IAttributeSet attrs, int defStyleRef) : base(context, attrs, defStyleRef)
		{
			SetLayoutManager(_SimpleLayoutManager = new LayoutManager(context));
		}

		private LayoutManager _SimpleLayoutManager;

		public LayoutManager SimpleLayoutManager
		{
			set => SetLayoutManager(_SimpleLayoutManager = value);
			get => GetLayoutManager() as LayoutManager ?? _SimpleLayoutManager;
		}

		public new class LayoutManager : LinearLayoutManager
		{
			public LayoutManager(Context context, IAttributeSet attrs, int defStyleAttr, int defStyleRes) : base(context, attrs, defStyleAttr, defStyleRes)
			{ }
			public LayoutManager(Context context, int orientation = Vertical, bool reverseLayout = false) : base(context, orientation, reverseLayout)
			{ }

			public override void OnLayoutChildren(Recycler? recycler, State? state)
			{
				try { base.OnLayoutChildren(recycler, state); }
				catch (Java.Lang.IndexOutOfBoundsException)
				{
					// IndexOutOfBoundsException Exception on sucessive list refreshes 
					// https://stackoverflow.com/questions/31759171/recyclerview-and-java-lang-indexoutofboundsexception-inconsistency-detected-in
				}
			}
		}
	}
}