package com.film.cat;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.film.cat.model.SimpleItem;

import java.util.ArrayList;

public class CatageActivity extends AppCompatActivity {
    private RecyclerView mRecyclerView;
    private ArrayList<SimpleItem> mDataItem;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_catage);

        data();

        mRecyclerView = (RecyclerView) findViewById(R.id.recyclerView);
        mRecyclerView.setLayoutManager(new LinearLayoutManager(getBaseContext()));
        mRecyclerView.setAdapter(new CustomAdapter());
    }

    private void data() {
        mDataItem = new ArrayList<SimpleItem>();
        mDataItem.add(new SimpleItem("ดูอย่างไรว่าน้องแมวของเราอายุเท่าไร",
                "\n ปกติแล้วถ้าเราเลี้ยงน้องแมวมาตั้งแต่เด็กคงไม่มีปัญหากับเรื่องอายุเพราะเราคงจดบันทึกไว้หรือถ้าลืมก็สามารถนับปีย้อนหลังได้ แต่สำหรับคนที่นำแมวจรมาเลี้ยง ไม่ว่าจะเจอเองหรืออุปการะมาจากสถานสงเคราะห์อาจจะพบปัญหาว่าไม่ทราบว่าแมวของเราอายุเท่าไหร่กันแน่ ดังนั้นคราวนี้เราจึงมาบอกวิธีดูอายุแมวแบบเบื้องต้นให้ได้ทราบกันดังนี้\n" +
                        "\n"));

        mDataItem.add(new SimpleItem("วิธีที่ 1 : ดูอายุแมวจากฟัน",
                "\n ฟันแมวถือว่าเป็นอวัยวะที่ใช้ดูอายุแมวได้ดีที่สุด โดยในเบื้องต้นแมวจะมีฟันน้ำนมที่เป็นฟันตัด (ฟันหน้า) งอกออกมาประมาณ 2-4 สัปดาห์ จากนั้นฟันเขี้ยวจะงอกตอน 3-4 สัปดาห์ ส่วนฟันกรามน้อย (premolars) จะงอกออกมาตอน 4-6 สัปดาห์ โดยฟันลูกแมวจะขึ้นครบตอนประมาณ 8 สัปดาห์ ซึ่งเราใช้ตำแหน่งของฟันเหล่านี้คาดคะเนอายุของลูกแมวคร่าวๆ ได้\n" +
                        "\n เมื่อลูกแมวอายุได้ประมาณ 6 เดือน ฟันน้ำนมจะถูกแทนที่ด้วยฟันแท้จนหมด ซึ่งหลังจากนี้เราจะคาดคะเนอายุแมวได้ยากขึ้นแต่ก็สามารถดูได้ โดยหากแมวตัวนั้นมีฟันแท้ทั้งปากและฟันยังมีสีขาวนวลแสดงว่ามีอายุประมาณ 6-12 เดือน แต่ถ้าฟันแท้เป็นสีเหลืองและบางซี่มีหินปูนนิดหน่อยแสดงว่าอาจจะมีอายุประมาณ 1-2 ปี แต่ถ้าฟันทุกซี่มีหินปูนเกาะหมดแสดงว่าอายุประมาณ 3-4 ปี และสุดท้ายถ้ามีหินปูนมากทุกฟันเลยแสดงว่าอายุ 5-10 ปี แต่ถ้าฟันมีหินปูนมากและมีฟันหลุดหายไปบางซี่ด้วยแสดงว่าอาจจะเป็นแมวแก่อายุ 10 ปีขึ้นไป\n" +
                        "\n"));

        mDataItem.add(new SimpleItem("วิธีที่ 2 : ดูอายุแมวจากดวงตา",
                "\n ดวงตาก็สามารถใช้เป็นวิธีดูอายุแมวได้เช่นกัน โดยดวงตาของแมวที่มีอายุน้อยจะมีความสดใสเป็นประกาย แต่ถ้าแมวที่อายุมากก็จะขุ่นลง รวมไปถึงอาจมีลักษณะเป็นฝ้าซึ่งเกิดจากต้อกระจกจากการที่มีอายุมากได้ แมวที่มีดวงตาขุ่นอาจมีอายุมากกว่า 5 ปีขึ้นไป และดวงตามีฝ้าแสดงว่าอายุอาจจะมากกว่า 7 ปีขึ้นไป แต่ทั้งนี้ทั้งนั้นก็ขึ้นอยู่กับว่าแมวตัวนั้นอยู่ในสภาพแวดล้อมแบบไหนด้วย\n" +
                        "\n"));

        mDataItem.add(new SimpleItem("วิธีที่ 3 : ดูอายุแมวจากขนและผิวหนัง",
                "\n ขนและผิวหนังก็เป็นอีกวิธีหนึ่งที่ใช้ดูอายุแมวได้คร่าวๆ โดยลูกแมวจนถึงแมวที่อายุไม่เกิน 1 ปีครึ่ง จะมีขนเส้นเล็ก นุ่ม ส่วนแมวที่อยู่ในวัยเจริญพันธุ์จะมีเส้นขนที่หนาและหยาบขึ้น และสุดท้ายแมวที่อายุตั้งแต่ 7 ปี ขึ้นไป อาจจะมีขนหงอกหรือขนสีซีดๆ แซมอยู่ตามตัวเหมือนกันผมหงอกของคนนั่นเอง\n" +
                        "\n"));

        mDataItem.add(new SimpleItem("วิธีที่ 4 : ดูอายุแมวจากขนาดตัว กระดูก และกล้ามเนื้อ",
                "\n วิธีดูอายุแมวจากขนาดตัว กระดูก และกล้ามเนื้อ จะทำได้ไม่แม่นยำมากนักในแมวที่โตเต็มวัยแล้ว โดยปกติเราทราบกันดีอยู่แล้วว่าลูกแมวจะมีขนาดตัวเล็ก เมื่อแมวอายุตั้งแต่ 2 ปี ขึ้นไป หรืออยู่ในช่วงโตเต็มวัยจะมีกล้ามเนื้อมากและรูปร่างสมส่วน ร่างกายมีความยืดหยุ่นและแข็งแรง ส่วนในแมวอายุมากตั้งแต่ 7 ปีขึ้นไป จะมีกล้ามเนื้อลดลง อาจจะเห็นปุ่มกระดูกตามไหล่ชัดเจนขึ้น\n" +
                        "\n"));

        mDataItem.add(new SimpleItem("วิธีที่ 5 : ดูอายุแมวจากนิสัย",
                "\n นิสัยก็พอจะสามารถใช้ดูอายุแมวคร่าวๆ ได้ โดยแมวอายุประมาณ 6 เดือน ถึง 1 ปี จะมีนิสัยตื่นตัว ร่าเริง ตอบสนองต่อสิ่งเร้าสูง เรียกได้ว่าพร้อมจะกระโจนเข้าหาของเล่นหรือวิ่งไปมาได้บ่อยๆ ส่วนแมวอายุ 2-5 ปี จะเริ่มสงบลง อาจจะมีเล่นบ้างแต่ก็ไม่ออกแรงมากเหมือนแต่ก่อน ส่วนแมวที่มีอายุมากตั้งแต่ 8 ปีขึ้นไป จะตอบสนองต่อสิ่งเร้าน้อยลง ไม่ค่อยวิ่ง และนอนมากขึ้น\n" +
                        "\n วิธีการดูอายุแมวหลังจากฟันแท้ขึ้นครบแล้วนั้นอาจจะไม่สามารถทำได้แม่นยำ 100% แต่โดยหลักการแล้วเราควรดูที่ฟันแมวก่อนจากนั้นจึงดูที่ดวงตา ลักษณะขน รูปร่างขนาดตัว และนิสัยมาช่วยกันประกอบการประเมินจะทำให้สามารถรู้อายุแมวนั้นๆ ได้แม่นยำมากขึ้น\n" +
                        "\n"));

    }

    private class CustomAdapter extends RecyclerView.Adapter<CustomHolder> {
        @NonNull
        @Override
        public CustomHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
            View view = LayoutInflater.from(parent.getContext()).inflate(android.R.layout.simple_list_item_2, parent, false);
            return new CustomHolder(view);
        }

        @Override
        public void onBindViewHolder(@NonNull CustomHolder holder, int position) {
            holder.tvText1.setText(mDataItem.get(position).getText1());
            holder.tvText2.setText(mDataItem.get(position).getText2());
        }

        @Override
        public int getItemCount() {
            return mDataItem.size();
        }
    }

    private class CustomHolder extends RecyclerView.ViewHolder {
        private final TextView tvText1;
        private final TextView tvText2;

        public CustomHolder(@NonNull View itemView) {
            super(itemView);

            tvText1 = (TextView) itemView.findViewById(android.R.id.text1);
            tvText2 = (TextView) itemView.findViewById(android.R.id.text2);
        }
    }
}
