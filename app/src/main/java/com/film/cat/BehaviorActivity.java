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

public class BehaviorActivity extends AppCompatActivity {

    private RecyclerView mRecyclerView;
    private ArrayList<SimpleItem> mDataItem;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_behavior);

        data();

        mRecyclerView = (RecyclerView) findViewById(R.id.recyclerView);
        mRecyclerView.setLayoutManager(new LinearLayoutManager(getBaseContext()));
        mRecyclerView.setAdapter(new CustomAdapter());
    }

    private void data() {
        mDataItem = new ArrayList<SimpleItem>();
        mDataItem.add(new SimpleItem("4 พฤติกรรมแบบไหน บอกได้ว่าน้องแมวสุขภาพดี",
                "\n 1.\t“ขี้เล่น เริงร่า” สัญญาณสุขภาพดีขั้นแรกของน้องแมว\n" +
                        "\n เมื่อไรก็ตามที่น้องแมวร่าเริง สดใส และขี้เล่น เดาได้ไม่ยากเลยค่ะว่าพวกเค้ากำลังแฮปปี้แบบสุดๆ เพราะ ‘นิสัยร่าเริง’ ถือว่าเป็นตัวชี้วัดที่ยอดเยี่ยมว่าเค้ามีสุขภาพแมวที่แข็งแรง และได้รับสารอาหารครบถ้วนตามที่ร่างกายต้องการ\n" +
                        "\n อีกหนึ่งในวิธีสังเกตง่ายๆ ว่าเค้ากำลังแฮปปี้หรือเปล่า คือการตอบสนองของเค้าค่ะ ถ้าน้องเหมียวกระตือรือร้นเวลาที่เราเล่นด้วย หรือเข้ามาชวนเราเล่นมีรูปแบบการเล่นที่หลากหลายทั้งกับตัวเองและน้องแมวตัวอื่นๆ ทั้งหมดนี้นับเป็นสัญญาณที่ดีค่ะ\n" +
                        "\n 2.\t“ทานง่าย ไม่เบื่ออาหาร” นี่แหละสัญญาณสุขภาพดีขั้นถัดมา\n" +
                        "\n เป็นที่รู้กันดีว่า เวลาที่น้องแมวมีสุขภาพสมบูรณ์แข็งแรงนั้น เค้าจะต้องทานอาหารได้เป็นปกติตามปริมาณที่เหมาะสมกับสายพันธุ์และช่วงวัยของเค้านะคะ ดังนั้นถ้าเราหมั่นสังเกตพฤติกรรมการกินของน้องแมวเวลาให้อาหารกับเค้าทุกครั้งอยู่แล้ว ว่าน้องแมวมีพฤติกรรมการทานที่ไม่เปลี่ยนไปจากปกติ หรือไม่มีอาการเบื่ออาหาร ทานน้อยกว่าที่เคย ฯลฯ ก็สบายใจได้ระดับหนึ่งแล้วล่ะว่าน้องแมวของเรามีสัญญาณสุขภาพดีนั่นเองค่ะ\n" +
                        "\n3.\tสัญญาณสุขภาพดีของน้องแมว “กินอิ่ม แล้วต้องนอนหลับ”\n" +
                        "\n น้องแมวส่วนใหญ่ก็เหมือนกับคนเรานั่นแหละค่ะ หลังกินอิ่มก็ต้องการนอนหลับหรือพักผ่อน ดังนั้นหากเห็นเค้าถอยกลับไปอยู่ในพื้นที่โปรดของเค้าเองหลังจากมื้ออาหาร ไม่ว่าจะเป็นใต้โต๊ะ บนชั้นวางของ หรือแม้แต่ในกล่องก็ไม่ต้องแปลกใจไป เพราะพฤติกรรมแมวเหล่านี้ถือเป็นเรื่องปกติที่ทำให้น้องแมวรู้สึกปลอดภัย และสามารถงีบหลับได้นานขึ้นนั่นเองค่ะ\n" +
                        "\n ทั้งนี้น้องแมวที่มีสัญญาณสุขภาพดีจะมีรูปแบบกิจวัตรประจำวันเฉพาะตัว ซึ่งประกอบไปด้วยการเล่น การกินอาหารแมว และการนอน เจ้าเหมียวจะรู้สึกดีที่สุดเมื่อกิจกรรมทั้งหมดนี้เกิดขึ้นระยะเวลาสั้นๆ แต่หลายครั้งในแต่ละวันนะคะ\n" +
                        "\n 4.\t“ขับถ่ายเป็นก้อน” สัญญาณสุขภาพดีที่น้องแมวต้องมี\n" +
                        "\n นอกจากน้องแมวร่าเริงแจ่มใส ทานอาหารได้ปกติ รวมถึงนอนหลับได้อย่างสบายแล้ว อีกหนึ่งวิธีที่ทำให้ทุกคนได้รู้ว่าน้องแมวของเรามีสุขภาพดีหรือเปล่า นั่นก็คือการสังเกตการขับถ่ายของเค้านั่นเองค่ะ โดยทุกครั้งเวลาที่ทำความสะอาดกระบะทรายให้น้องแมว ให้เราลองสังเกตว่าอุจจาระที่น้องแมวขับถ่ายทิ้งไว้นั้นมีลักษณะเป็นก้อน มีขนาดเล็กหรือไม่ หากเป็นแบบนั้นก็สบายใจได้ค่ะ ว่าน้องแมวมีระบบย่อยอาหารและขับถ่ายดีซึ่งเป็นหนึ่งในสัญญาณสุขภาพดีแล้วล่ะ\n" +
                        "\n"));

        mDataItem.add(new SimpleItem("แล้วสัญญาณที่น่าเป็นห่วงของน้องแมว มีอะไรบ้างนะ?",
                "\n ถ้าน้องแมวร่าเริงคือสัญญาณของการเป็นแมวสุขภาพดี แล้วพฤติกรรมแมวอะไรที่น่าเป็นห่วงบ้างนะ? เราขอชวนเพื่อนๆ ให้ลองสังเกตเจ้าเหมียวของตัวเอง มาดูกันซิว่าน้องแมวที่บ้านกำลังมีพฤติกรรมแบบนี้อยู่หรือเปล่า\n" +
                        "\n -\tช่วงนี้น้องแมวดูหงอยๆ ไป ชวนเล่นก็ไม่เล่นด้วย\n" +
                        "\n -\tน้องแมวเล่นรุนแรงขึ้น\n" +
                        "\n -\tน้องแมวหมดความสนใจ ในของเล่นชิ้นโปรดไปแล้ว\n" +
                        "\n -\tน้องแมวส่งเสียงร้องดังกว่าปกติ\n" +
                        "\n -\tน้องแมวดูเหมือนจะไม่สนใจ และหมดพลังในการเล่นไปแล้ว\n" +
                        "\n -\tน้องแมวมีอาการตื่นตัวมาก จนนอนไม่ได้\n" +
                        "\n -\tน้องแมวเชื่องช้า ไร้พลัง หรือไม่ยอมตื่นจากการนอนง่ายๆ\n" +
                        "\n หากน้องแมวของเพื่อนๆ มีสัญญาณพฤติกรรมข้อใดข้อหนึ่งบนนี้ เป็นไปได้ว่าสุขภาพแมวอาจไม่ได้อยู่ในภาวะปกติ ไม่ว่าจะจากอาการป่วย การพักผ่อนไม่เพียงพอ หรือจากการที่ได้รับสารอาหารไม่เหมาะสมกับตัวของเค้าค่ะ วิธีแก้ไขเบื้องต้นก็คือ แนะนำให้เพื่อนๆ เลือกอาหารที่ช่วยเสริมสร้างภูมิต้านทาน ช่วยให้เค้าไม่ป่วยง่าย ร่าเริง และเคลื่อนไหวอย่างกระฉับกระเฉงขึ้น\n" +
                        "\n ถ้าอยากให้น้องแมวของเพื่อนๆ มีครบ 6 สัญญาณสุขภาพดี การหมั่นสังเกตพฤติกรรมของ น้องแมว รวมถึงการใส่ใจดูแลเค้าทั้งในด้านการดูแลสุขอนามัยและด้านอาหารการกิน ในฐานะที่เราอยู่ใกล้ชิดกับเค้ามากที่สุดคือสิ่งที่ควรทำอย่างสม่ำเสมอ แต่เพื่อความมั่นใจ หากน้องแมวแสดงพฤติกรรมที่ผิดปกติจากเดิมไม่ยอมหาย ก็อย่าลืมพาเค้าไปพบคุณหมอ เพื่อตรวจเช็คอาการโดยละเอียดด้วยนะคะ\n" +
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
