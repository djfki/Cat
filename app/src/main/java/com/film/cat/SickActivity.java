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

public class SickActivity extends AppCompatActivity {
    private RecyclerView mRecyclerView;
    private ArrayList<SimpleItem> mDataItem;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sick);

        data();

        mRecyclerView = (RecyclerView) findViewById(R.id.recyclerView);
        mRecyclerView.setLayoutManager(new LinearLayoutManager(getBaseContext()));
        mRecyclerView.setAdapter(new CustomAdapter());
    }

    private void data() {
        mDataItem = new ArrayList<SimpleItem>();
        mDataItem.add(new SimpleItem("รู้ได้อย่างไรว่าน้องแมวป่วย",
                "\n เพราะน้องแมวอาจไม่สามารถพูดกับเราได้ว่าเขารู้สึกไม่สบายตัว ปวดท้อง เวียนหัว หรือมีไข้เหมือนที่เราสามารถพูดกับคุณหมอได้ เมื่อน้องแมวเริ่มมีอาการป่วย แต่ว่าเราไม่รู้ หรือไม่สังเกตความผิดปกติที่เกิดขึ้นได้อย่างทันท่วงที มารู้อีกทีน้องแมวก็อาจป่วยหนักจนเกินกว่าที่เราจะรักษาได้ทัน หรือแทนที่จะใช้เวลารักษาไม่นาน กลับต้องวิ่งเข้าวิ่งออกโรงพยาบาลสัตว์พบคุณหมอแบบรัวๆ แทนก็ได้\n" +
                        "\n"));

        mDataItem.add(new SimpleItem("แล้วจะรู้ได้อย่างไรว่าน้องแมวป่วยอยู่ล่ะ?",
                "\n บอกเลยว่าไม่ยากเกินไปแน่นอน มาสังเกตอาการแมวป่วยก่อนจะสายกันเถอะ\n" +
                        "\n • พฤติกรรมเปลี่ยนไป : อาการง่ายๆ ที่สังเกตเห็นได้ คือ แมวซึม แม้จะมีของเล่นชิ้นโปรดมาล่อก็ไม่สนใจ หรือพฤติกรรมอาจเปลี่ยนไปจากปกติที่เป็นน้องเหมียวสายเที่ยว แต่อยู่ๆ ก็ซ่อนตัวอยู่ตามซอกหลืบทั้งวันเสียอย่างนั้น สาเหตุของพฤติกรรมที่เปลี่ยนอาจเป็นเพราะน้องแมวมีอาการป่วย หรือถ้าสังเกตพบว่าน้องแมวเลียบริเวณใดบริเวณหนึ่งบ่อย โดยที่ไม่ใช่การเลียขนตามปกติ และเมื่อเราไปจับตรงนั้นน้องแมวก็ขู่ฟ่อเข้าให้ นั่นก็อาจเป็นเพราะว่าน้องแมวเจ็บบริเวณนั้นอยู่ก็ได้นะ เรื่องเล็กๆ เหล่านี้ หมั่นเอาใจใส่และสังเกตให้ดี เพราะนี่อาจเป็นสัญญาณที่บอกว่าแมวของคุณกำลังป่วยอยู่\n" +
                        "\n • กินน้ำและอาหารไม่เหมือนเดิม : อาการน้องแมวเบื่ออาหารมักจะพ่วงมากับอาการแมวซึม อยู่ๆ ก็เมินใส่อาหารโปรด อ้อนวอนกันทุกท่าก็ไม่อยากจะลุกมากิน หรือหากชามน้ำที่วางไว้พร่องเยอะไปมากกว่าทุกวันจนผิดสังเกต บวกกับอาการขับถ่ายปัสสาวะปกติ นั่นก็อาจเป็นสัญญาณที่บ่งบอกถึงโรคเบาหวาน โรคไต หรือโรคเกี่ยวกับฮอร์โมนได้เหมือนกันนะ ทางที่ดีหากพบการกินที่ผิดปกติไม่ว่าจะเป็นอาหารหรือน้ำก็ตาม ให้พาน้องแมวไปพบคุณหมอจะดีกว่า\n" +
                        "\n • ขับถ่ายไม่ปกติ : การขับถ่ายที่เราพูดถึงนี้หมายถึงทั้งการอุจจาระ และปัสสาวะ ที่ผิดปกติ เช่น อึแข็งกว่าปกติ อึเหลว ถ่ายมีเลือดปน มีสิ่งแปลกปลอม มีพยาธิปนออกมา มีอาการเบ่งปัสสาวะ ปัสสาวะเยอะ หรือไม่มีปัสสาวะออกมาเลย อาการเหล่านี้เป็นอาการที่บอกว่ากำลังเกิดปัญหากับน้องแมวของเรา แม้จะยังไม่สามารถระบุได้ว่าเป็นโรคใด แต่สัญญาณที่มากับกระบะทรายนี้แหละที่บอกว่ากำลังเกิดปัญหาเกี่ยวกับระบบขับถ่ายของน้องแมวอยู่ ช้าไม่ได้แล้ว\n" +
                        "\n • ขนหยาบ หนังตั้ง : อาจจะเป็นสัญญาณของการขาดน้ำ ทดสอบได้ง่ายๆ ด้วยการลองดึงหนังคอของน้องแมว ถ้าหนังยังตั้งอยู่ไม่ยุบลงคืนสภาพเดิม นั้นหมายความว่าน้องแมวของเราได้รับน้ำไม่เพียงพอต่อความต้องการของร่างกาย แล้วถ้าลองลูบขนดูแล้วพบว่าขนหยาบกระด้าง ไม่ลื่นเงางาม นั้นก็แปลว่าน้องแมวป่วยอยู่ หรือขาดสารอาหารที่ช่วยบำรุงร่างกาย เช่น โอเมก้า 3 และ 6 รวมทั้งวิตามิน E และ A การเลือกอาหารที่มีสารอาหารเหล่านี้เป็นส่วนประกอบ ก็จะช่วยคืนผิวหนังและขนที่สุขภาพดีให้กลับมาได้\n" +
                        "\n • สีเหงือกไม่เหมือนเดิม : วิธีการเช็คสุขภาพเบื้องต้นให้น้องแมวอย่างง่ายๆ เช็คได้ที่สีเหงือกนี่แหละ โดยสีเหงือกของน้องแมวต้องมีสีชมพู เมื่อลองกดบนเหงือกแล้ว สีของเหงือกควรจะกลับมาเป็นสีชมพูอย่างเดิมได้ใน 2 วินาที หากเหงือกมีสีซีดเกินไป หรือเมื่อกดบนเหงือกแล้วสีเหงือกกลับมาเป็นปกติช้า แสดงว่าน้องแมวอาจมีปัญหาเลือดจาง หรือมีระบบไหลเวียนเลือดไม่ปกติ แต่หากเหงือกมีสีแดงกว่าปกติ จนเขียวคล้ำ นั่นเป็นสัญญาณอันตรายที่บอกว่าน้องแมวขาดออกซิเจน หรือโดนสารพิษได้\n" +
                        "\n • ผอมไป อ้วนเกิน : เมื่อน้องแมวน้ำหนักลดลงแบบไร้สาเหตุที่ชัดเจน นี่ไม่ใช่เรื่องธรรมดาแล้วล่ะ เพราะหากน้องแมวผอมลงอย่างรวดเร็วแล้วนั่นหมายความว่าน้องแมวกำลังสูญเสียมวลกล้ามเนื้อ หรือมีระบบการเผาผลาญของร่างกายที่ผิดปกติไป ซึ่งอาจเป็นโรคที่เกี่ยวกับฮอร์โมน เช่น โรคไฮเปอร์ไทรอยด์ได้ ส่วนน้องแมวที่อ้วนเกินไปก็อาจจะเสี่ยงต่อภาวะโรคเบาหวาน รวมทั้งปัญหาข้อและกระดูกได้ไม่ต่างจากคนเราเลย\n" +
                        "\n แน่นอนว่าการไม่มีโรค ย่อมเป็นลาภอันประเสริฐสำหรับน้องแมวเช่นเดียวกับคนเรานี่แหละ และการดูแลน้องแมวให้สุขภาพดีไม่ใช่เรื่องยาก แค่เริ่มจากภายใน เพียงแค่ดูแลใส่ใจเรื่องอาหารการกินของน้องแมวให้มากยิ่งขึ้น เพราะอาหารที่ดี มีผลต่อสุขภาพของน้องแมวเป็นอย่างมาก หากน้องแมวได้รับอาหารที่ผลิตด้วยวัตถุดิบคุณภาพสูง และอุดมด้วยสารอาหารครบคุณค่าเหมาะกับน้องแมวในแต่ละช่วงวัยแล้ว น้องแมวของเราก็จะห่างไกลจากอาการป่วยที่กวนตัวเจ้าแมวเองและกวนใจเจ้าของแล้วล่ะ\n" +
                        "\n"));

        mDataItem.add(new SimpleItem("",
                "\n \n" +
                        "\n"));

        mDataItem.add(new SimpleItem("",
                "\n \n" +
                        "\n"));

        mDataItem.add(new SimpleItem("",
                "\n \n" +
                        "\n"));

        mDataItem.add(new SimpleItem("",
                "\n \n" +
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
