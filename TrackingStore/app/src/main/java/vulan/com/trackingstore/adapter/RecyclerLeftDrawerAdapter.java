package vulan.com.trackingstore.adapter;

import android.content.Context;
import android.content.Intent;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;

import com.bumptech.glide.Glide;

import java.io.Serializable;
import java.util.List;

import vulan.com.trackingstore.R;
import vulan.com.trackingstore.data.listener.OnLeftItemClickListener;
import vulan.com.trackingstore.data.model.BeaconWithShop;
import vulan.com.trackingstore.data.model.Shop;
import vulan.com.trackingstore.ui.activity.ShopActivity;
import vulan.com.trackingstore.util.Constants;

/**
 * Created by VULAN on 10/21/2016.
 */

public class RecyclerLeftDrawerAdapter extends RecyclerView.Adapter<RecyclerLeftDrawerAdapter.ItemHolder> {
    private List<BeaconWithShop> mNavigationDrawerLeftItems;
    private Context mContext;
    private OnLeftItemClickListener mOnRecyclerItemInteractListener;
//    private List<Beacon> beaconList = new ArrayList<>();

    public RecyclerLeftDrawerAdapter(Context context, List<BeaconWithShop> items) {
        mContext = context;
        mNavigationDrawerLeftItems = items;
    }

    public void setOnClick(OnLeftItemClickListener onRecyclerItemInteractListener) {
        mOnRecyclerItemInteractListener = onRecyclerItemInteractListener;
    }

    @Override
    public RecyclerLeftDrawerAdapter.ItemHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        return new ItemHolder(LayoutInflater.from(parent.getContext()).
                inflate(R.layout.item_shop_left_recycler, parent, false));
    }

    @Override
    public void onBindViewHolder(final RecyclerLeftDrawerAdapter.ItemHolder holder, int position) {
        final BeaconWithShop item = mNavigationDrawerLeftItems.get(position);
        final Shop shop = new Shop(item.getmShopId(), item.getmUrlImageWithoutBase(), item.getmShopName(), item.getmShopAddress()
                , item.getmShopPhone(), item.getmShopDescipt(), item.getmShopEmail(), item.getmLocationX(), item.getmLocationY());
        Glide.with(mContext).load(item.getmUrlImage()).fitCenter().into(holder.mImageShop);
        holder.mTextName.setText(item.getmShopName());
        if (item.getmShopAddress() != null) {
            holder.mTextAddress.setText(item.getmShopAddress().trim());
        }
        holder.mTextName.setSelected(true);
        holder.mTextAddress.setSelected(true);
        holder.mLayoutShop.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(mContext, ShopActivity.class);
                intent.putExtra(Constants.ShopInfo.SHOP_MODEL, (Serializable) shop);
                mContext.startActivity(intent);
            }
        });
    }


    @Override
    public int getItemCount() {
        return mNavigationDrawerLeftItems.size();
    }

    class ItemHolder extends RecyclerView.ViewHolder {
        private ImageView mImageShop;
        private RelativeLayout mLayoutShop;
        private TextView mTextName, mTextAddress, mTextDistance;

        public ItemHolder(View itemView) {
            super(itemView);
            mLayoutShop = (RelativeLayout) itemView.findViewById(R.id.layout_shop_menu);
            mImageShop = (ImageView) itemView.findViewById(R.id.img_shop_menu);
            mTextName = (TextView) itemView.findViewById(R.id.tv_name_menu);
            mTextAddress = (TextView) itemView.findViewById(R.id.tv_address_menu);
//            mTextDistance = (TextView) itemView.findViewById(R.id.tv_distance_menu);
        }
    }
}
