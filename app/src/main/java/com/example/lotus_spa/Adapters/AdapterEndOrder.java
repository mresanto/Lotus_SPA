package com.example.lotus_spa.Adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckBox;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.lotus_spa.Class.OrderItem;
import com.example.lotus_spa.Class.Product;
import com.example.lotus_spa.R;

import org.jetbrains.annotations.NotNull;

import java.util.List;

public class AdapterEndOrder extends RecyclerView.Adapter<AdapterEndOrder.MyViewHolder>  {

    private Context mContext;
    private List<OrderItem> orderItems;
    private AdapterEndOrder mItemListener;
    public ImageView mAddProduct;


    public AdapterEndOrder(Context mContext, List<OrderItem> orderItems){
        this.mContext = mContext;
        this.orderItems = orderItems;
    }

    @NonNull
    @NotNull
    @Override
    public AdapterEndOrder.MyViewHolder onCreateViewHolder(@NonNull @NotNull ViewGroup parent, int viewType) {
        View view;
        LayoutInflater mInflater = LayoutInflater.from(mContext);
        view = mInflater.inflate(R.layout.custom_endordem_item_layout, parent, false);



        return new MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull @NotNull AdapterEndOrder.MyViewHolder holder, int position) {


        holder.nameitem.setText("Nome: "+orderItems.get(position).getProdName());
        //Add image
        switch (orderItems.get(position).getProdBarCode()) {
            case 123600006:
                holder.imageitem.setImageResource(R.drawable.shampo_johnson);
                break;
            case 123607999:
                holder.imageitem.setImageResource(R.drawable.creme_reduxcel);
                break;
            case 123609999:
                holder.imageitem.setImageResource(R.drawable.creme_de_massagem_pimenta_negra);
                break;
            case 123654656:
                holder.imageitem.setImageResource(R.drawable.shampo_pantene);
                break;
            case 555555555:
                holder.imageitem.setImageResource(R.drawable.pente_santa_clara);
                break;
        }

        holder.priceitem.setText("Preço: "+orderItems.get(position).getItemUnitaryPrice());
    }

    @Override
    public int getItemCount() {
        return orderItems.size();
    }

    public interface ItemClickListener{
        void onItemClick(Product product);
        void onAddClick(Product product);
    }

    public static class MyViewHolder extends  RecyclerView.ViewHolder{

        TextView nameitem;
        TextView priceitem;
        ImageView imageitem;
        CheckBox checkitem;

        public MyViewHolder(View itemView){
            super(itemView);

            nameitem = (TextView) itemView.findViewById(R.id.txtResPrice);
            priceitem = (TextView) itemView.findViewById(R.id.txtResValidity);
            imageitem = (ImageView) itemView.findViewById(R.id.imgProductOrderItemDisplay);
        }
    }
}
