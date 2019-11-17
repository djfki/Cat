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

public class TechniqueActivity extends AppCompatActivity {

    private RecyclerView mRecyclerView;
    private ArrayList<SimpleItem> mDataItem;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_technique);

        data();

        mRecyclerView = (RecyclerView) findViewById(R.id.recyclerView);
        mRecyclerView.setLayoutManager(new LinearLayoutManager(getBaseContext()));
        mRecyclerView.setAdapter(new CustomAdapter());

    }

    private void data() {
        mDataItem = new ArrayList<SimpleItem>();
        mDataItem.add(new SimpleItem("เทคนิคให้อาหารแมวและลูกแมวที่ควรรู้",
                "ทราบไหมคะ ว่าน้องแมวแต่ละตัวนั้น มีนิสัยการกินที่แตกต่างกัน บางตัวอาจจะทานง่าย กินทุกอย่างที่ขวางหน้า แต่น้องแมวบางตัวก็อาจจะเลือกกินแบบสุดๆ เอาใจยากเสียเหลือเกิน ซึ่งพฤติกรรมการกินของน้องแมวส่วนใหญ่นั้นมักจะควบคุมไม่ได้ เพราะเกิดจากสัญชาติญาณที่ติดตัวเค้ามาตั้งแต่เกิด แต่ถ้าเราให้เวลากับน้องแมวมากพอ รวมถึงลองใช้เทคนิคสำหรับเลี้ยงแมวตามนี้ ไม่ว่าใครก็จะกลายเป็นคนรักที่แสนรู้ใจของน้อง และดูแลเค้าให้มีสุขภาพดีได้ไม่ยากเลยค่ะ\n" +
                        "\n"));
        mDataItem.add(new SimpleItem("ใช้ภาชนะแบบไหนดีนะ?",
                "เชื่อว่าหลายคนก็คงไม่เคยรู้มาก่อน ว่าสิ่งสำคัญที่ควรใส่ใจในการเลือกชามอาหารให้กับน้องแมวก็คือ ความกว้างและความลึกของชาม โดยจะต้องไม่ทำให้ “หนวด” ของเค้าเลอะเทอะระหว่างที่กำลังทานนั่นเอง โดยมีเทคนิคง่ายๆดังนี้ค่ะ\n" +
                        "- ควรเลือกชามอาหารที่มีความลึกพอสำหรับใส่อาหารทั้งวันของน้องแมว\n" +
                        "- ชามอาหารที่ใช้ควรมีความกว้างเพียงพอที่หนวดของน้องแมวจะไม่สัมผัสกับขอบชาม รวมถึงควรเลือกชามที่มีระดับความสูงพอเหมาะ เพื่อให้เค้าเคี้ยวอาหารได้โดยไม่เลอะเทอะหนวดค่ะ\n" +
                        "- ถ้าใครที่มีน้องแมวชอบทานมูมมาม แนะนำให้ปูแผ่นรองกันเปื้อนเอาไว้ใต้จานกันเลอะจะช่วยได้มากเลยล่ะ\n" +
                        "\n"));
        mDataItem.add(new SimpleItem("แล้วควรจะวางชามข้าวแมวไว้ตรงไหนดีนะ?",
                "จุดที่คุณควรจะวางชามอาหารแมวนั้นสำคัญกว่าที่คิดมากค่ะ เพราะน้องแมวส่วนใหญ่มักจะชอบทานอาหารท่ามกลางพื้นที่โล่งที่สามารถมองเห็นได้รอบตัว ซึ่งเป็นสัญชาตญาณ นักล่าของเค้า ที่จะคอยระวังอันตรายเวลาทานอาหารนั่นเอง ซึ่งเทคนิคการเลือกสถานที่วางชามข้าวน้องแมวที่แนะนำก็คือ\n" +
                        "- หลีกเลี่ยงการวางชามข้าวแมวเอาไว้ที่มุมห้อง เพราะเป็นมุมอับ ไม่เหมาะสำหรับพฤติกรรมตามธรรมชาติของน้องแมว\n" +
                        "- วางชามข้าวแมวเอาไว้ในที่โล่ง ที่เค้าสามารถมองเห็นรอบตัวได้กว้างที่สุดเท่าที่จะทำได้ ซึ่งจะทำให้เค้าสบายใจไม่กดดันระหว่างที่ทานอาหารค่ะ\n" +
                        "- เพื่อสุขอนามัยที่ดีของน้องแมว แนะนำให้วางชามอาหารแมวเอาไว้ในจุดที่ห่างจากโซนที่ใช้ขับถ่าย ไม่ว่าจะเป็นกระบะทรายแมวของเค้า หรือห้องน้ำของเราเองเองนะคะ จะได้ลดโอกาสที่เชื้อโรคใดๆ เข้าไปปะปนกับอาหารของน้องแมวจนอาจส่งผลต่อสุขภาพของเค้าได้นั่นเอง\n" +
                        "\n"));
        mDataItem.add(new SimpleItem("แล้วควรจะให้อาหารน้องแมวมากแค่ไหนดีนะ?",
                "น้องแมวต่างขนาด ต่างสายพันธุ์ และมีอายุที่แตกต่างกัน ก็ต้องการปริมาณอาหารที่ไม่เหมือนกันค่ะ แต่หลักสำคัญในการกำหนดปริมาณอาหารให้กับน้องแมวก็คือ ควรให้อาหารอย่างเพียงพอเพื่อให้เค้ามีร่างกายที่สมส่วน ไม่อ้วนหรือผอมเกินไป ซึ่งเป็นหนึ่งใน 6 สัญญาณแมวสุขภาพดีนั่นเอง\n" +
                        "คุณอาจจะใช้วิธีประเมินน้ำหนักที่เหมาะสม เพื่อใช้กำหนดปริมาณอาหารที่ควรให้กับน้องแมวได้ ด้วยวิธีการตามนี้ค่ะ\n" +
                        "- เช็กจากมุมบน ว่าเห็นเอวใต้กระดูกซี่โครงของเค้าหรือเปล่า เพราะน้องแมวที่สุขภาพดีควรจะมีรูปทรงที่เอวเป็นรูปนาฬิกาทราย\n" +
                        "- เช็กจากด้านข้าง ด้วยการก้มไปดูที่ท้องของเจ้าเหมียวของคุณ แล้วดูซิว่าเห็นกระดูกซี่โครงหรือเปล่า\n" +
                        "- เช็กจากซี่โครง ด้วยการวางมือไปที่บนหลังของน้องแมว โดยให้นิ้วโป้งทั้งสองอยู่ที่กระดูกด้านหลัง วาดมือไปตามลำตัวของเค้า แล้วลองดูว่าคุณสัมผัสกระดูกซี่โครงของเค้าได้หรือไม่ ถ้าไม่ก็ต้องลดปริมาณอาหารน้องแมวในแต่ละวันแล้วนะคะ\n" +
                        "\n"));
        mDataItem.add(new SimpleItem("ควรให้อาหารลูกแมวมากแค่ไหนถึงเหมาะสม?",
                "เพราะช่วงวัยของลูกแมวตัวน้อย เป็นช่วงวัยที่เค้ายังคงเติบโตและมีพัฒนาการอย่างต่อเนื่อง ทำให้การกำหนดปริมาณอาหารให้เค้าจึงต้องใส่ใจถึงกิจกรรมที่เค้าทำในแต่ละวันเป็นหลัก เพื่อให้เค้าเติบโตเป็นแมวสุขภาพดีสมวัย ซึ่งมีเทคนิคการดูแลดังนี้ค่ะ\n" +
                        "- ลูกแมวส่วนใหญ่จะเริ่มเคี้ยวได้ตอนที่อายุได้ 3-4 สัปดาห์ เราสามารถค่อยๆ เพิ่มอาหารแบบแห้งลงไปให้เค้าได้ และในสัปดาห์ที่ 8 ลูกแมวก็จะเริ่มสามารถทานอาหารแบบแห้งเป็นหลักได้แล้ว\n" +
                        "- คุณสามารถเปลี่ยนอาหารแบบแห้งให้ลูกแมวกินง่ายขึ้นด้วยการผสมน้ำอุ่น 1 ส่วน อาหารเม็ด 3 ส่วน ก่อนเทลงในชามข้าว แต่อย่าลืมเด็ดขาดว่าต้องเป็นน้ำอุ่นเท่านั้นนะ และระวังอย่าให้ร้อนจนลวกปากเค้าล่ะ\n" +
                        "- คำนวณปริมาณอาหารสำหรับลูกแมว ตามวิธีการ และปริมาณอาหารแนะนำต่อวันตามที่เขียนไว้บนกล่องบรรจุภัณฑ์ อย่าลืมแบ่งออกเป็นหลายๆส่วน แล้วทำให้นิ่มโดยการผสมน้ำอุ่นเพื่อให้ลูกแมวได้รับอาหารใหม่ๆ และพร้อมทานเสมอ\n" +
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
