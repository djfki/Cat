package com.film.cat;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.film.cat.model.SimpleItem;

import java.util.ArrayList;

public class WaterActivity extends AppCompatActivity {

    private RecyclerView mRecyclerView;
    private ArrayList<SimpleItem> mDataItem;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_water);

        data();

        mRecyclerView = (RecyclerView) findViewById(R.id.recyclerView);
        mRecyclerView.setLayoutManager(new LinearLayoutManager(getBaseContext()));
        mRecyclerView.setAdapter(new CustomAdapter());
    }
    private void data() {
        mDataItem = new ArrayList<SimpleItem>();
        mDataItem.add(new SimpleItem("ไขทุกประเด็นกับปัญหาแมวกินน้ำน้อย",
                " หลายคนอาจสงสัยว่าทำไมถึงไม่ค่อยเห็นแมวกินน้ำเลย หรือบางทีกินแต่ก็น้อยมาก แบบนี้จะไม่เป็นอันตรายต่อสุขภาพหรือเปล่า จริงๆ แล้วแมวควรกินน้ำเท่าไหร่กันแน่ เพื่อแก้ข้อสงสัยนี้เราจะมาไขปริศนากันว่ามีสาเหตุอะไรบ้างที่ทำให้แมวไม่กินน้ำและกินน้ำน้อย รวมไปถึงวิธีแก้ไขเบื้องต้นง่ายๆ กัน\n" +
                        "\n"));
        mDataItem.add(new SimpleItem("1. แมวเป็นสัตว์ที่กินน้ำน้อยโดยธรรมชาติอยู่แล้ว",
                " เชื่อกันว่าบรรพบุรุษของแมวถือกำเนิดขึ้นในดินแดนแห้งแล้งแถบทะเลทราย จึงทำให้แมวกินน้ำน้อยเพราะถูกจำกัดโดยสิ่งแวดล้อม แม้ว่าในปัจจุบันเวลาจะผ่านมานานแล้วแต่อุปนิสัยนี้ก็ยังคงติดตัวแมวมาอยู่ดี ทำให้แมวส่วนใหญ่ยังคงกินน้ำน้อยโดยอัตโนมัติ แต่อย่างไรก็ดีสัตวแพทย์ได้วิเคราะห์ออกมาแล้วว่าแมวควรได้รับน้ำประมาณ 44-66 มิลลิลิตร ต่อ น้ำหนักตัว 1 กิโลกรัม โดยถ้าแมวกินน้ำน้อยเกินไปจะทำให้เสี่ยงต่อการเป็นโรคไต โรคนิ่ว และโรคระบบทางเดินปัสสาวะได้\n" +
                        "\n"));
        mDataItem.add(new SimpleItem("2. น้ำที่ให้ไม่สะอาด",
                "สาเหตุที่แมวกินน้ำน้อยหรือไม่ยอมกินน้ำอาจเป็นเพราะน้ำที่เราให้ไม่สะอาดหรือมีสิ่งปนเปื้อน ลองตรวจเช็คว่าน้ำที่ให้แมวไม่มีตะกอนและไม่มีกลิ่นที่เขาไม่ชอบ รวมไปถึงไม่ควรทิ้งน้ำไว้นานเกินไป โดยการเปลี่ยนน้ำบ่อยๆ ประมาณ 2-3 ชม. ต่อครั้ง จะช่วยกระตุ้นให้แมวกินน้ำมากขึ้นได้ หรือถ้าอากาศร้อน แมวจะชอบกินน้ำที่เย็นนิดๆ มากกว่า น้ำอุ่นหรือน้ำตามอุณหภูมิห้อง\n" +
                        "\n"));
        mDataItem.add(new SimpleItem(" 3. ตำแหน่งการวางชามใส่น้ำไม่เหมาะสม",
                "ตำแหน่งการวางชามใส่น้ำควรวางไว้ห่างจากกระบะทรายแมว เพราะของเสียและกลิ่นบนกระบะอาจจะปนเปื้อนลงในน้ำทำให้แมวไม่กินน้ำในชามนั้น รวมไปถึงก็ไม่ควรวางใกล้อาหารเพราะแมวไม่ชอบให้อาหารกระเด็นลงในน้ำหรือน้ำมีกลิ่นอาหารปนอยู่ โดยควรวางชามใส่น้ำอยู่ในพื้นที่เงียบสงบไม่มีคนพลุกพล่านหรือผ่านไปผ่านมาบ่อยๆ รวมไปถึงควรอยู่ในพื้นที่ที่แมวเข้าถึงง่าย การวางชามน้ำอยู่คนละชั้นหรือคนละพื้นที่กับที่แมวอยู่ประจำจะทำให้เขารู้สึกว่าไปกินน้ำลำบากและทำให้แมวไม่ยอมกินน้ำได้\n" +
                        "\n"));
        mDataItem.add(new SimpleItem(" 4. ลักษณะภาชนะและวิธีการให้น้ำไม่ถูกใจน้องแมว",
                "แมวแต่ละตัวล้วนมีนิสัยที่เป็นเอกลักษณ์ ทำให้แมวบางตัวอาจจะไม่ชอบกินน้ำจากชามเฉยๆ แต่ชอบกินน้ำจากน้ำพุแมวก็ได้ ดังนั้นลองหาวิธีต่างๆ เพื่อกระตุ้นให้แมวกินน้ำมากขึ้น เช่น ลองให้แมวกินน้ำจากน้ำพุแมว หรือกินน้ำจากก๊อกเพื่อเพิ่มความแปลกใหม่ หรือลองเปลี่ยนภาชนะใส่น้ำเป็นแบบต่างๆ ที่ทำให้ดึงดูดพวกเขามากขึ้นก็ได้เช่นกัน โดยทั่วไปแมวมักจะไม่ชอบชามใส่น้ำที่ลึกและแคบเพราะเมื่อก้มลงไปกินน้ำแล้วจะทำให้หนวดติดบริเวณขอบภาชนะทำให้รู้สึกไม่สบายตัวทำให้แมวไม่กินน้ำได้ ดังนั้นจึงควรเลือกชามใส่น้ำที่แบน กว้าง และค่อนข้างตื้นจะทำให้แมวกินน้ำได้ง่ายกว่าภาชนะทรงแคบและลึกจะทำให้แมวกินน้ำลำบากเพราะเมื่อก้มลงไปแล้ว หนวดจะติดอยู่ข้างขอบภาชนะทำให้รู้สึกไม่สบายตัว แต่สุดท้ายถ้าทำอย่างไร ก็พบว่าแมวไม่ยอมกินน้ำเพิ่มอยู่ดี เราขอแนะนำวิธีการง่ายๆ ที่ทำให้เขาได้รับน้ำเพียงพอในแต่ละวันนั่นคือการให้อาหารเปียก เพราะในอาหารเปียกมีน้ำเป็นส่วนประกอบอยู่มากทำให้เมื่อแมวกินเข้าไปแล้วก็จะได้รับน้ำเข้าไปด้วยนั่นเอง\n" +
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
