package com.example.bby.hacettepe.oldiesbutgoldies

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.Toast
import com.example.bby.hacettepe.oldiesbutgoldies.R.id.metinTutucu
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.activity_story.*

class story : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_story)

        var sayfa = 1
        var sayfalar = arrayOf(R.drawable.arkaplan02)
        var metinler = arrayOf("DOKUZ KUYRUKLU TİLKİ\n" +
                "Bu hikayede anlatılan dokuz kuyruklu tilki efsanesi bir çok oyun dizi ve oyun karakterine ilham vermiştir. Bu oyunlardan bir tanesi de League of Legends oyunudur. Bu oyundaki Ahri karekterinin bu efsaneden esinlenilerek yapıldığı düşünülmektedir.\n","Zamanında Joseon krallığında (KORE) Gu Mi Ho adında çok güzel bir kız yaşarmış. Bu kız öyle güzelmiş ki kral bile bu kız için methiyeler dizer ona ipek ve altından armağanlar yollarmış. Gel zaman git zaman kızın güzelliği ülkede duyulmuş." +
                " Qing Hanedanından (ÇİN) bile insanlar bu kızla evlenmek için kendi içlerinde ölümcül kavgalar eder olmuşlar." +
                " Aradan yıllar geçmiş ve Gu Mi Ho aşkı genç bir çiftçi olan Chen Eun Baek adında bir delikanlıda bulmuş." +
                " Onca krala rağmen kızcağaz sadece aşk ve sevgisi bulunan bu adamı istiyormuş." +
                " Birbirlerine tutkuyla bağlanmışlar. Ancak genç delikanlı o kadar yakışıklıymış ki köyün tüm kızları ona aşıkmış." +
                " Düğün günü gelip çattığında Gu Mi Ho gelinliğini giymiş ve evinin çardağında oturup kocasını beklemeye başlamış." +
                " Bu sırada köyün tüm kızları sokağa dökülüp kıskançlıkla bağırmışlar.”Gu Mi Ho bir cadı. Biz onun erkekleri tuzağa düşürüp ciğerlerini yediğini gördük.”" +
                " Bunları duyan genç çiftçi Cheng korkmuş.Düğüne gitmeme kararı almış.","Ancak genç kız kocasını günlerce beklemiş." +
                " Kızın evinin yakınından geçenler onu çardakta gelinlikle otururken görünce gerçekten korkmuşlar." +
                " Tapınaklarına gidip köyün koruyucusu büyük anne Mingang’a yalvarmışlar ve demişler ki ” Lütfen büyük nne başımızdaki bu belayı kaldır. Ciğer yiyen tilkiyi kafese kapat ki kocalarımız ve çocuklarımız güvende olsun.”" +
                " Bunun üzerine büyük anne yapraklarla süzülmüş ve yavaşça Gu Mi Ho‘nun çardağına gelmiş." +
                " İnce tülü aralayıp içeri girince ne görsün. Gu Mi Ho’nun güzelim makyajı akmış, cam gibi gözleri ağlamaktan şişmiş ve kadife sesi gıcır gıcır kısılmış." +
                " Büyük anne Mingang kıza acımış ancak yinede köydekileri rahatlatmak için zavallı kızın arkasına geçmiş ve ciğerine bir hançer saplamış.","Gökyüzündeki güneş bir anda daha da parlamaya başlamış." +
                " Kızcağızın ipek gibi teni tüylenmiş ve kürklenmiş zeytin gözleri mavi olmuş." +
                " Oklava gibi beli eğrilmiş kamburlaşmış ve bir tilki olmuş." +
                " Hemde dokuz kuyruklu bir tilki. " +
                "Sonra Mingang  Gu Mi Ho’yu ensesinden tuttuğu gibi bir resmin içine atıp kuyruklarını da resimden silivermiş." +
                " Zavallı kız suçsuz yere hem hapis hem tilki olmuş. Ardından ağlamaya başlamış." +
                " O ağladığı gibi o güneşli bulutsuz havada yağmur yağmaya başlamış. İşte tilki yağmurunun hikayesi de buradan gelir.","AY-ATAM\n" +
                "Ay-Atam Efsanesi, Memlükler döneminde Mısır’da yaşamış olan Türk tarihçisi Aybek-üd Devâdârî tarafından kayda geçirilmiş bir Türk efsanesidir. Ay-Atam Efsanesinin konusu insanoğlunun yaratılışıdır. Ön Asya mitolojisinin etkileri görülür.\n"
                ,"Çok çok eski çağlarda…\n" +
                "Çok yağmurlar yağdı. Gök delinmiş gibiydi. Dünya sele boğuldu, her yanı çamurlar kapladı. Çamurlar akan selle yuvarlanarak Kara Dağ’daki bir mağaraya doldular. Mağaranın içindeki kayalar yarıldı. Yarıkların kimileri insanı andırıyordu. Sürüklenen çamurlar bu insan biçimli yarıkları doldurdular.Aradan çok zaman geçti. Yarıklardaki balçıklar sular ile benzeşti, hâllodu. Güneş Saratan burcuna gedi ve havalar çok ısındı. Yarıklardaki balçık sular ile pişti. Yarıkların bulunduğu bu mağara tıpkı bir kadın gibiydi. İçi de insanlara can veren bir kadın karnı gibiydi.\n"
        ,"Dokuz ay durmadan yel esti….\n" +
                "Su, ateş, toprak ve yel, insana can vermak için birleştiler. Dokuz ay sonra bir insan çıktı ortaya. Adına Ay-Atam dediler. Ay-Atam, gökten indi yere kondu. Bu yerin suyu tatlı, havası da serindi. Sonra yine yağmurlar, seller başladı. Mağara yeniden çamurla doldu. Güneş bu kez Sünbüle burcunda durdu. Sünbüle burcundaki güneşin sıcaklığı ile balçıklar sular ile pişti. Bu kez bir hatun kişi çıktı ortaya. Adına Ay-Va dediler.\n"
        ,"Ay-Atam ile Ay-Va evlendiler. Kırk çocukları oldu. Bunların yarısı erkek, yarısı da kızdı. Onlar da evlendiler; soyları çoğaldı. Bir zaman geldi Ay-Atam ile Ay-Va Hatun’un ömürleri doldu; öldüler. Çocukları, ana-babalarını türedikleri mağaraya gömdüler. Mağaranın kapısını altın kapılar ile kapattılar, dört bir yanını çiçekle süslediler.","PANDORA\n" +
                "Yunan mitolojisi hikayelerinden biridir.\n","Mitolojide ölümlüler ( yani insanlar) ve ölümsüzler ( yani tanrılar) birarada yaşamaktaymış. Ancak insanlar o dönemde sadece erkeklerden oluşmakta imiş. Tanrılarla o denli laubali olup, sınırsız olmuşlar ki Zeus bu şımarık, ters, ahlaksız , kaba , kendini akıllı ve güçlü sanan aptallar ordusuna, kendilerini hale yola soksun ve incelsinler diye az çok vücutça kendilerine benzeyen ama aslında kendilerinden çok farklı, bir varlık gönderdi\"kadınlar\".Zeus sanatkar bir tanrı olan ve dahice eşyalar yapan bir tanrı olan oğlu Hephaistos 'a bu işi havale etti. O da toprak ve suyu çamur haline getirerek, kadın şeklini oluşturdu. Kalbine başkalarına uzaktan hoş , parıltılı, göz alıcı , büyüleyici romantik ; yakınına gidince ise \"dışı seni, içi beni yakar\" türünden kor halinde ateş yerleştirmiş. Tüm tanrı ve periler ona o kadar çok özellik, güzellik ve hediyeler vermişler ki adı Pandora ( tümüyle armağan) olmuş.","Afrodit ona vücut modelini ve güzelliklerini , Athena ince ve süslü elbiseler ve bunları giyme hevesini, Hermes ise onun kalbine ihanet , kıskançlık ve aldatıcılık tohumlarını atmış. Zeus ise onu insanlar arasına göndermeden önce bir kutu vererek, bu kutuyu kendisi izin vermeden açmamasını söylemiş. O yeryüzüne gönderilirken ,ateşi dolayısı ile aklı tanrılardan çalarak, insanlara kazandıran Prometheus'un kardeşine yollanmış. Bu sırada Prometheus kardeşini uyararak, Zeus'un göndereceği hediyeyi almamasını, aksi takdirde bu varlıklara uygun davranılmadığında ,yeryüzünde bu varlıkların intiharlar, katliamlar ve savaşlara yol açacağını söylemiş. Ama Prometheus' un kardeşi gördüğü güzellik karşısında her şeyi unutarak, onu erkeklerin dünyasına götürmüş.","Bu güzellik abidesi de yeryüzüne indiğinde içindeki merağı yenememiş. Açılması yasak olan kutuyu açıvermiş. Kutu açılır açılmaz içinden acı, şehvet, yalan, ihanet vb. her türden dert bir anda tüm dünyaya dağılıvermiş. Bu sırada olayın korkunç şokundan kurtulabilen Pandora hemen kutunun kapağını kapatabilmiş , ancak kutunun içinde sadece ümit hissi kalabilmiş.")
        metinTutucu.setText(metinler[0])

        ileriButon.setOnClickListener(object : View.OnClickListener {
            override fun onClick(view: View): Unit {
                if (sayfa < metinler.size) {
                    sayfa++
                    Log.d("Dizi", metinler[sayfa - 1].toString())
                    metinTutucu.setText(metinler[sayfa - 1])
                } else {
                    Toast.makeText(this@story, "Son sayfadasınız..!",
                            Toast.LENGTH_LONG).show()
                }
            }
        })

        geriButon.setOnClickListener(object : View.OnClickListener {
            override fun onClick(view: View): Unit {
                if (sayfa > 1) {
                    sayfa--
                    Log.d("Dizi", metinler[sayfa - 1].toString())
                    metinTutucu.setText(metinler[sayfa - 1])
                } else {
                    Toast.makeText(this@story, "İlk sayfadasınız..!",
                            Toast.LENGTH_LONG).show()
                }
            }
        })

    }
}
