package com.smnadim21.satouism;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.smnadim21.satouism.adapter.TopicsAdapter;

import java.util.ArrayList;
import java.util.List;

public class ItemListActivity extends AppCompatActivity {

    private RecyclerView recyclerView;
    private RecyclerView.Adapter mAdapter;
    private RecyclerView.LayoutManager layoutManager;
    List<CatItem> myDataset = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_item_list);



        myDataset.add(new CatItem(
                "Paro",
                "Paro is a small town situated in the Paro Valley of Bhutan. It is one of the most fertile as well as historic valley of Bhutan which is the widest in the Kingdom. It is home to 155 temples and monasteries dating back to the 14th century and also Bhutan's sole international airport. The Paro Airport is the largest International Airport of Bhutan and has been one of the prime locations for numerous tourist visit. It is known to be the most challenging airport to land on.\n" +
                        "With mesmerising landscape, Paro is dotted with traditionally built houses as well as paddy fields. One of the iconic monasteries of Bhutan- The Tiger's nest or the Taktsang, is situated over a cliff in Paro. Apart from this, Paro has numerous sites that are worth visiting, from Monasteries to Museums like the Rinpung Dzong, National Museum of Bhutan and the Paro weekend Market for the Shopaholics.\n" +
                        "\n" +
                        "Paro is both the name of the district as well as a town located within the region. The city is known to be situated at the height of about 2280 metres on the banks of Paro Chu river, which is spread across an area of 1259 sq.m. The Paro Chhu river is the lifeline of Paro, adding a glorious touch to it. Paro town was formed in the year 1985, which now consists of colourfully painted shops lined all across the street. Over the years, Paro has been transformed enormously, and this is one of the prime reasons for the increase in tourist activity.\n",
                R.drawable.image12,
                "Paro, Bhutan"));


        myDataset.add(new CatItem(
                "Thimphu",
                "Thimphu is known as the heart of Bhutan nestled in its central-western part. Replaced by Bhutan's ancient capital - Punakha, Thimphu was declared the capital city of the Himalayan Kingdom in the year 1961. Originally pronounced as 'Thimbu', the city is known as the most modernised place in Bhutan with internet cafes, restaurants and pubs.\n" +
                        "The Nightlife in Thimphu is also one of its highlights. However, Thimphu still holds on to the Bhutanese Traditions as it houses various architectural structures like the Buddha Dordenma, which marks your entry to Thimphu. The Motithang district of Thimphu also preserves the national animal of Bhutan - The Takin. With institutions like Textile Museum, Library, Art schools and the weekend market; the city isn't just a heritage centre but a cultural site as well. An hour drive from Paro International Airport, the city of Thimphu is a blend of both tradition and modernity. It is also known as the only capital that doesn't have any traffic lights installed.\n",
                R.drawable.image2,
                "Thimphu, Bhutan"));


        myDataset.add(new CatItem(
                "Wangdue Phodrang Tourism",
                "Being one of the largest Dzongkhangs (District) of Bhutan, Wangdue Phodrang has everything from monasteries and temple to wildlife and rustic villages. The reason why the region is different as compared to others is that it is very diverse in terms of subtropical forests in the south to cold, snowy areas in the north. With Wangchuck Centennial Park in the northern part and Jigme Dorji National Park in the southeastern region, Wangdue Phodrang is a host of numerous plants and animal species.\n" +
                        "Plants like or orchids, Rhododendrons, Blue Poppy and rare animals like the Red Panda, snow leopard, Blue Sheep and Black Bear can be found in this district. It is also home to many monasteries and temples for the spiritually inclined soul to visit. There are also hikes and treks with beautiful views for the nature-lovers as well. A particularly attractive place to visit in Wangdue Phodrang would be Phobjikha Valley, which is one of the few glacial valleys in the country and is abound in natural beauty.\n",
                R.drawable.image3,
                "Wangdue Phodrang, Bhutan"));


        myDataset.add(new CatItem(
                "Goa",
                "Lying on the west coast, Goa is one of the smallest states in India known for its brilliant beaches, scrumptious food and Portuguese heritage. Panjim, the capital city located in the centre is well-connected with an international airport and roads and trains run from North to South part of Goa.\n" +
                        "With a coastline stretching for over 100 kilometres, Goa has numerous beaches that attract millions of visitors. While Baga and Calangute are more popular among the Indian family crowd, Anjuna and Arambol draw a lot of foreign tourists. The beaches in South Goa are relatively lesser explored, but some of them like Agonda and Palolem are more beautiful. \n" +
                        "\n" +
                        "A former Portuguese colony, Goa also boasts of beautiful architecture from the colonial era with many churches and old-style bungalows. The people are quite friendly towards tourists and celebrate many festivals throughout the year. While the seafood is excellent, Goa has one of the best nightlife in the country with trendy bars, beach shacks, elegant cafes and many clubs and discotheques. Thanks to lower alcohol prices in the state, Goa is also great for younger tourists with relatively tighter pockets.\n",
                R.drawable.image4,
                "GOA, India"));

        myDataset.add(new CatItem(
                "Agra",
                "Home to one of the 7 wonders of the world, the Taj Mahal, Agra is a sneak peek into the architectural history with other UNESCO World Heritage Sites as Agra Fort and Fatehpur Sikri. History, architecture, romance all together create the magic of Agra and hence makes for a must-visit for anyone living in or visiting India.\n" +
                        "Located on the banks of river Yamuna, History fanatics, as well as architecture buffs, can have a ball here with the sheer expanse of the Mughal art and culture on display. Apart from its monuments, the city also has some exciting stuff for foodies - including the famous Agra ka Petha and amazing chaat and Lassi.\n",
                R.drawable.image5,
                "Agra, India"));

        myDataset.add(new CatItem(
                "Manali",
                "Nestled in between the snow-capped slopes of the Pir Panjal and the Dhauladhar ranges, Manali is one of the most popular hill stations in the country. With jaw-dropping views, lush green forests, sprawling meadows carpeted with flowers, gushing blue streams, a perpetual fairy-tale like mist lingering in the air, and a persistent fragrance of pines and freshness -  Manali has been blessed with extraordinary scenic beauty. From museums to temples, from quaint little hippie villages to bustling upscale streets, river adventures to trekking trails, Manali has every reason to be the tourist magnet it is, all year round.\n" +
                        "Clean roads, swaying eucalyptus trees, endearing little eateries, small kitschy local market places, and cafes which serve delicious local food at unbelievable prices, Old Manali is a serene, tranquil place, whose lingering silence is broken only by the twittering of the birds and the sound of the roaring waters of the Kullu river.\n" +
                        "\n" +
                        "Solang Valley is the of the most visited places in Manali, with the drive up to Solang being as picturesque as the valley itself. Not only does Solang Valley offer some breathtaking views of the surrounding landscape, but its slopes are also a very popular skiing destination, especially during the winters. In summers, the place turns into a paragliding haven. If you're an adventure enthusiast, Solang Valley has adrenaline-pumping activities such as zorbing and horse-riding available.\n" +
                        "\n" +
                        "With more than 25 lakh visitors every year, Rohtang Pass easily stands out as one of the most popular scenic spots to visit in Manali. Connecting the Lahaul and Kullu valleys, the Rohtang Pass is famous among nature lovers, photographers and adventure seekers alike. Mountain biking or skiing whilst surrounded by the awe-inspiring glaciers and snow-capped peaks on all sides is an exhilarating experience.\n" +
                        "\n" +
                        "Manali is also home to a tiny slice of history, in the form of the Naggar castle. Located among the breathtaking forests in Naggar town, the Naggar Castle is a stunning historical edifice. Once used as the residence of Raja Sidh Singh of Kullu, the castle is a fine blend of traditional Himalayan and European architecture. With majestic fireplaces, beautifully built staircases, and meticulous wood and stone works, the Naggar Castle is a must-visit when you're in Manali.\n",
                R.drawable.image6,
                "Manali, India"));

        myDataset.add(new CatItem(
                "Andaman & Nicobar Islands",
                "Replete with picturesque shimmering beaches, lagoons of turquoise blue waters and a bit of history, Andaman & Nicobar Islands is a little slice of paradise tucked around 1,400 km away from the east coast of India. The union territory comprises a total of 572 islands, only 37 of which are inhabited and a few are open to the tourists. \n" +
                        "\n" +
                        "Port Blair, the capital city of Andaman & Nicobar Islands, is the gateway to the archipelago and is connected with various islands via multiple daily ferries. Havelock and Neil Island are some of the most famous islands among tourists and is known for pearly white sands, palm-lined shores and offer some of the best snorkelling and diving options in India.\n" +
                        "Once known for its Cellular Jail- ‘Kaala Paani’ in Port Blair which primarily imprisoned the freedom fighters who were exiled from the mainland of India during the British Era, the graph of the Andaman and Nicobar islands have lately changed drastically and it is now known for its flourishing tourism industry which especially attracts honeymooners, families and adventure enthusiasts. \n" +
                        "\n" +
                        "You can either laze around on the sandy shores and enjoy the mesmerising sunsets or try your hand at scuba diving and explore the vibrant coral reefs. Besides, it also has virgin immaculate backwaters for those seeking solitude and ataraxy.\n" +
                        "\n" +
                        "Havelock Island is one of the largest and the most popular attraction of all of Andaman & Nicobar Islands. Blessed with pristine beaches and coconut groves, this one offers myriad adventure sports opportunities to its guests. From snorkelling to parasailing, scuba diving and kayaking etc., there is no dearth of thrilling activities here, for that much-needed adrenaline rush, on an otherwise tranquil leisure vacay. \n" +
                        "\n" +
                        "In addition to this, you can visit the bustling city of Port Blair to get a glimpse of the local lifestyle. Steeped in colonial history and boasting of striking architectural monuments, you can also browse the local markets and savour the traditional cuisine.\n",
                R.drawable.image7,
                "Andaman & Nicobar Islands, India"));

        myDataset.add(new CatItem(
                "Pokhara",
                "Pokhara, the 'Tourist Capital of Nepal,' is the second-largest city in Nepal, after Kathmandu. At an altitude of more than 900m, it is one of the highest as well.\n" +
                        "The city is divided into two parts - Lakeside Pokhara and Old City. Phewa Lake (or Phewa Tal), a spectacular lake borders Lakeside Pokhara while Old City is the commercial hub. Phewa Lake flawlessly reflects the mountains that border it, making it a breathtaking photo-op and a boating paradise. Charming shops, dreamy cafés, restaurants and pubs that line Lakeside Pokhara compliments the postcard-perfect scenery. The old city houses shops where you can buy famous handicrafts, woodwork and woolwork. Visit the Tibetan Mini Market for one-of-a-kind souvenirs!\n" +
                        "\n" +
                        "Pokhara is cut by the Seti Gandaki River and her many tributaries, which contributes to the unique geography - many gorges and caves even within city limits!\n" +
                        "\n" +
                        "Trekkers throng Pokhara as it is a popular starting point for many treks in the Annapurna Range. The Annapurna Circuit Trek is a challenging trek that is rewarded with striking views of Pokhara valley atop Mt. Machhapuchhre. The Sarangkot trail is a much shorter one, which is perfect for novices. \n" +
                        "\n" +
                        "Pokhara offers paragliding and river rafting to all thrill-seekers. You can take solo or tandem rides, depending on your expertise. River rafting and white water rafting are offered on Seti Gandaki and her tributaries.\n",
                R.drawable.image8,
                "Pokhara, Nepal"));

        myDataset.add(new CatItem(
                "Kathmandu",
                "Kathmandu, the city of peace, lives true to this description. The city is charming, busy, bustling, serene, alive and asleep - all at once. The capital of Nepal, Kathmandu is the most accessible city in the country - it is Nepal's only metropolitan city as well. From buying trekking equipment in Thamel or taking a rickshaw ride through traffic-packed alleys of the old part of the city or simply visiting the fascinating buildings in Durbar Squares, Kathmandu is truly a place filled with warmth.\n" +
                        "Kathmandu is home to more than 1.5 million people. The city is at an altitude of a whopping 1400 metres or 4600 feet, which assures a blissful climate, all year long. Kathmandu, which is derived from the Pahari word for 'wood shelter', is an abode of serenity and tranquillity, with its monasteries, temples and spiritual melting pots. While the natural beauty of the city is more than enough for travellers to throng Kathmandu year after year, what sets it apart from other tourist destinations is the variety it offers - from spiritual awakening to adventure sports\n",
                R.drawable.image9,
                "Kathmandu,Nepal"));

        myDataset.add(new CatItem(
                "Colombo",
                "Colombo is Sri Lanka's prime city. The official capital, Sri Jayewardenepura Kotte, is also within the urban area of Colombo, so Colombo is often called the capital of Sri Lanka as well. The city has a rich colonial heritage, and also some very scenic and popular attractions.\n" +
                        "Colombo is arguably Sri Lanka's most popular tourist destination. The coastal city is a beautiful place to spend a couple of days just relaxing, indulging in the local food, and leisure activities. It has a good collection of attractions to serve just this purpose, like the Galle Face Green, the Beira lake, and the Viharamahadevi Park, which are popular places for picnics and also for you to spend some quality time with your loved one. The city still has many structures from the colonial period and early history. Most of the museums you see today were once used by the colonial masters. Take for example the Dutch Museum, which was actually the residence of the Dutch Governor of Ceylon when it was first built. Even the Maritime Museum was once a Dutch prison. In Colombo you'll also find plenty of Buddhist temples, the most famous of these being the Gangaramaya, and the Kelaniya Raj Maha Vihara. Not just that, Colombo is a great place for you to shop for local handlooms, and when you're done with that, indulge in a variety of sea foods and local cuisine. Colombo makes for a beautiful escape to a picturesque coastal city.\n",
                R.drawable.image10,
                "Colombo, Sri-Lanka"));

        myDataset.add(new CatItem(
                "Galle Face Green, Colombo",
                "The Galle Face Green is a beautiful beach park which covers an area of almost five hectares and is in the fort area of Sri Lanka's capital, Colombo. Enjoy yourself and forget the worries of your day by indulging in a vast span of activities like kite flying, fishing, football, beach volleyball, jogging, or just taking a relaxing stroll by the beach.\n" +
                        "This area was initially laid out by in 1859 by the Governor Sir Henry George Ward. It is frequently visited by many locals in Colombo to sit back, relax and spend some quality time with loved ones. All this makes it the perfect coastal marvel, making the most out of the sea, stars, and sand\n",
                R.drawable.image10,
                "Colombo, Sri-Lanka"));




   /*     for( int i = 0 ; i < myDataset.size();i++ )
        {
            FirebaseDatabase.getInstance().getReference()
                    .child("bdArcheology")
                    .child("bdArcheology_" + i)
                    .setValue(myDataset.get(i));
        }
*/

         recyclerView = (RecyclerView) findViewById(R.id.rv_main);

        // use this setting to improve performance if you know that changes
        // in content do not change the layout size of the RecyclerView
        recyclerView.setHasFixedSize(true);

        // use a linear layout manager
        layoutManager = new LinearLayoutManager(this,RecyclerView.VERTICAL,false);
        recyclerView.setLayoutManager(layoutManager);

         mAdapter = new TopicsAdapter(this,myDataset);
         recyclerView.setAdapter(mAdapter);
    }



}
