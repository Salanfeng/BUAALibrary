package com.xuexiang.xuidemo.fragment.components.refresh;

import android.os.Handler;
import android.os.Looper;

import androidx.recyclerview.widget.RecyclerView;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;

import com.xuexiang.xpage.annotation.Page;
import com.xuexiang.xui.utils.WidgetUtils;
import com.xuexiang.xuidemo.server.Provider;
import com.xuexiang.xuidemo.R;
import com.xuexiang.xuidemo.adapter.SimpleRecyclerAdapter;
import com.xuexiang.xuidemo.base.BaseFragment;

import butterknife.BindView;

/**
 * @author XUE
 * @since 2019/4/1 9:59
 */
@Page(name = "SwipeRefreshLayout\n谷歌官方下拉刷新控件")
public class SwipeRefreshLayoutFragment extends BaseFragment {

    private static final int[] COLORS = new int[]{0xff0099cc, 0xffff4444, 0xff669900, 0xffaa66cc, 0xffff8800};

    private SimpleRecyclerAdapter mAdapter;

    @BindView(R.id.recyclerView)
    RecyclerView recyclerView;
    @BindView(R.id.swipe_refresh_layout)
    SwipeRefreshLayout swipeRefreshLayout;

    @Override
    protected int getLayoutId() {
        return R.layout.fragment_swipe_refresh_layout;
    }

    /**
     * 初始化控件
     */
    @Override
    protected void initViews() {
        WidgetUtils.initRecyclerView(recyclerView);

        recyclerView.setAdapter(mAdapter = new SimpleRecyclerAdapter());

        swipeRefreshLayout.setColorSchemeColors(COLORS);
    }

    @Override
    protected void initListeners() {
        //下拉刷新
        swipeRefreshLayout.setOnRefreshListener(this::loadData);
        refresh(); //第一次进入触发自动刷新，演示效果
    }

    private void refresh() {
        swipeRefreshLayout.setRefreshing(true);
        loadData();
    }

    private void loadData() {
        new Handler(Looper.getMainLooper()).postDelayed(() -> {
            mAdapter.refresh(Provider.getDemoData());
            if (swipeRefreshLayout != null) {
                swipeRefreshLayout.setRefreshing(false);
            }
        }, 1000);
    }

}
