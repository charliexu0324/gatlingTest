package mightycampers

import scala.concurrent.duration._

import io.gatling.core.Predef._
import io.gatling.http.Predef._
import io.gatling.jdbc.Predef._

class BookChecking extends Simulation {

  private val httpProtocol = http
    .baseUrl("https://api.aws.thlonline.com")
    .inferHtmlResources(AllowList(), DenyList(""".*\.js""", """.*\.css""", """.*\.gif""", """.*\.jpeg""", """.*\.jpg""", """.*\.ico""", """.*\.woff""", """.*\.woff2""", """.*\.(t|o)tf""", """.*\.png""", """.*detectportal\.firefox\.com.*"""))
  
  private val headers_0 = Map(
  		"accept" -> "text/html,application/xhtml+xml,application/xml;q=0.9,image/avif,image/webp,image/apng,*/*;q=0.8,application/signed-exchange;v=b3;q=0.9",
  		"accept-encoding" -> "gzip, deflate, br",
  		"accept-language" -> "en-NZ,en-GB;q=0.9,en-US;q=0.8,en;q=0.7,zh-CN;q=0.6,zh;q=0.5",
  		"sec-ch-ua" -> """Chromium";v="104", " Not A;Brand";v="99", "Google Chrome";v="104""",
  		"sec-ch-ua-mobile" -> "?0",
  		"sec-ch-ua-platform" -> "Windows",
  		"sec-fetch-dest" -> "document",
  		"sec-fetch-mode" -> "navigate",
  		"sec-fetch-site" -> "none",
  		"sec-fetch-user" -> "?1",
  		"upgrade-insecure-requests" -> "1",
  		"user-agent" -> "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/104.0.0.0 Safari/537.36"
  )
  
  private val headers_1 = Map(
  		"accept" -> "*/*",
  		"accept-encoding" -> "gzip, deflate, br",
  		"accept-language" -> "en-NZ,en-GB;q=0.9,en-US;q=0.8,en;q=0.7,zh-CN;q=0.6,zh;q=0.5",
  		"sec-ch-ua" -> """Chromium";v="104", " Not A;Brand";v="99", "Google Chrome";v="104""",
  		"sec-ch-ua-mobile" -> "?0",
  		"sec-ch-ua-platform" -> "Windows",
  		"sec-fetch-dest" -> "script",
  		"sec-fetch-mode" -> "no-cors",
  		"sec-fetch-site" -> "cross-site",
  		"user-agent" -> "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/104.0.0.0 Safari/537.36"
  )
  
  private val headers_2 = Map(
  		"accept" -> "*/*",
  		"accept-encoding" -> "gzip, deflate, br",
  		"accept-language" -> "en-NZ,en-GB;q=0.9,en-US;q=0.8,en;q=0.7,zh-CN;q=0.6,zh;q=0.5",
  		"origin" -> "https://booking.mightycampers.com",
  		"sec-ch-ua" -> """Chromium";v="104", " Not A;Brand";v="99", "Google Chrome";v="104""",
  		"sec-ch-ua-mobile" -> "?0",
  		"sec-ch-ua-platform" -> "Windows",
  		"sec-fetch-dest" -> "empty",
  		"sec-fetch-mode" -> "cors",
  		"sec-fetch-site" -> "cross-site",
  		"user-agent" -> "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/104.0.0.0 Safari/537.36"
  )
  
  private val headers_3 = Map(
  		"Accept" -> "*/*",
  		"Accept-Encoding" -> "gzip, deflate, br",
  		"Accept-Language" -> "en-NZ,en-GB;q=0.9,en-US;q=0.8,en;q=0.7,zh-CN;q=0.6,zh;q=0.5",
  		"Origin" -> "https://booking.mightycampers.com",
  		"Sec-Fetch-Dest" -> "empty",
  		"Sec-Fetch-Mode" -> "cors",
  		"Sec-Fetch-Site" -> "cross-site",
  		"User-Agent" -> "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/104.0.0.0 Safari/537.36",
  		"sec-ch-ua" -> """Chromium";v="104", " Not A;Brand";v="99", "Google Chrome";v="104""",
  		"sec-ch-ua-mobile" -> "?0",
  		"sec-ch-ua-platform" -> "Windows"
  )
  
  private val headers_4 = Map(
  		"accept" -> "text/html,application/xhtml+xml,application/xml;q=0.9,image/avif,image/webp,image/apng,*/*;q=0.8,application/signed-exchange;v=b3;q=0.9",
  		"accept-encoding" -> "gzip, deflate, br",
  		"accept-language" -> "en-NZ,en-GB;q=0.9,en-US;q=0.8,en;q=0.7,zh-CN;q=0.6,zh;q=0.5",
  		"sec-ch-ua" -> """Chromium";v="104", " Not A;Brand";v="99", "Google Chrome";v="104""",
  		"sec-ch-ua-mobile" -> "?0",
  		"sec-ch-ua-platform" -> "Windows",
  		"sec-fetch-dest" -> "iframe",
  		"sec-fetch-mode" -> "navigate",
  		"sec-fetch-site" -> "cross-site",
  		"upgrade-insecure-requests" -> "1",
  		"user-agent" -> "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/104.0.0.0 Safari/537.36",
  		"x-client-data" -> "CIm2yQEIorbJAQjBtskBCKmdygEIkqHLAQjvu8wBCJi9zAEIssHMAQjFwcwBCNfBzAE="
  )
  
  private val headers_8 = Map(
  		"accept" -> "application/json, text/plain, */*",
  		"accept-encoding" -> "gzip, deflate, br",
  		"accept-language" -> "en-NZ,en-GB;q=0.9,en-US;q=0.8,en;q=0.7,zh-CN;q=0.6,zh;q=0.5",
  		"origin" -> "https://booking.mightycampers.com",
  		"sec-ch-ua" -> """Chromium";v="104", " Not A;Brand";v="99", "Google Chrome";v="104""",
  		"sec-ch-ua-mobile" -> "?0",
  		"sec-ch-ua-platform" -> "Windows",
  		"sec-fetch-dest" -> "empty",
  		"sec-fetch-mode" -> "cors",
  		"sec-fetch-site" -> "cross-site",
  		"user-agent" -> "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/104.0.0.0 Safari/537.36"
  )
  
  private val headers_10 = Map(
  		"accept" -> "*/*",
  		"accept-encoding" -> "gzip, deflate, br",
  		"accept-language" -> "en-NZ,en-GB;q=0.9,en-US;q=0.8,en;q=0.7,zh-CN;q=0.6,zh;q=0.5",
  		"sec-ch-ua" -> """Chromium";v="104", " Not A;Brand";v="99", "Google Chrome";v="104""",
  		"sec-ch-ua-mobile" -> "?0",
  		"sec-ch-ua-platform" -> "Windows",
  		"sec-fetch-dest" -> "script",
  		"sec-fetch-mode" -> "no-cors",
  		"sec-fetch-site" -> "cross-site",
  		"user-agent" -> "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/104.0.0.0 Safari/537.36",
  		"x-client-data" -> "CIm2yQEIorbJAQjBtskBCKmdygEIkqHLAQjvu8wBCJi9zAEIssHMAQjFwcwBCNfBzAE="
  )
  
  private val headers_11 = Map(
  		"accept" -> "*/*",
  		"accept-encoding" -> "gzip, deflate, br",
  		"accept-language" -> "en-NZ,en-GB;q=0.9,en-US;q=0.8,en;q=0.7,zh-CN;q=0.6,zh;q=0.5",
  		"content-type" -> "text/plain",
  		"origin" -> "https://booking.mightycampers.com",
  		"sec-ch-ua" -> """Chromium";v="104", " Not A;Brand";v="99", "Google Chrome";v="104""",
  		"sec-ch-ua-mobile" -> "?0",
  		"sec-ch-ua-platform" -> "Windows",
  		"sec-fetch-dest" -> "empty",
  		"sec-fetch-mode" -> "cors",
  		"sec-fetch-site" -> "cross-site",
  		"user-agent" -> "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/104.0.0.0 Safari/537.36"
  )
  
  private val headers_12 = Map(
  		"accept" -> "*/*",
  		"accept-encoding" -> "gzip, deflate, br",
  		"accept-language" -> "en-NZ,en-GB;q=0.9,en-US;q=0.8,en;q=0.7,zh-CN;q=0.6,zh;q=0.5",
  		"content-type" -> "text/plain",
  		"origin" -> "https://booking.mightycampers.com",
  		"sec-ch-ua" -> """Chromium";v="104", " Not A;Brand";v="99", "Google Chrome";v="104""",
  		"sec-ch-ua-mobile" -> "?0",
  		"sec-ch-ua-platform" -> "Windows",
  		"sec-fetch-dest" -> "empty",
  		"sec-fetch-mode" -> "cors",
  		"sec-fetch-site" -> "cross-site",
  		"user-agent" -> "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/104.0.0.0 Safari/537.36",
  		"x-client-data" -> "CIm2yQEIorbJAQjBtskBCKmdygEIkqHLAQjvu8wBCJi9zAEIssHMAQjFwcwBCNfBzAE="
  )
  
  private val headers_16 = Map(
  		"Accept" -> "*/*",
  		"Accept-Encoding" -> "gzip, deflate, br",
  		"Accept-Language" -> "en-NZ,en-GB;q=0.9,en-US;q=0.8,en;q=0.7,zh-CN;q=0.6,zh;q=0.5",
  		"Origin" -> "https://booking.mightycampers.com",
  		"Sec-Fetch-Dest" -> "empty",
  		"Sec-Fetch-Mode" -> "no-cors",
  		"Sec-Fetch-Site" -> "cross-site",
  		"User-Agent" -> "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/104.0.0.0 Safari/537.36",
  		"sec-ch-ua" -> """Chromium";v="104", " Not A;Brand";v="99", "Google Chrome";v="104""",
  		"sec-ch-ua-mobile" -> "?0",
  		"sec-ch-ua-platform" -> "Windows"
  )
  
  private val headers_17 = Map(
  		"accept" -> "image/avif,image/webp,image/apng,image/svg+xml,image/*,*/*;q=0.8",
  		"accept-encoding" -> "gzip, deflate, br",
  		"accept-language" -> "en-NZ,en-GB;q=0.9,en-US;q=0.8,en;q=0.7,zh-CN;q=0.6,zh;q=0.5",
  		"sec-ch-ua" -> """Chromium";v="104", " Not A;Brand";v="99", "Google Chrome";v="104""",
  		"sec-ch-ua-mobile" -> "?0",
  		"sec-ch-ua-platform" -> "Windows",
  		"sec-fetch-dest" -> "image",
  		"sec-fetch-mode" -> "no-cors",
  		"sec-fetch-site" -> "cross-site",
  		"user-agent" -> "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/104.0.0.0 Safari/537.36"
  )
  
  
  private val uri01 = "https://www.google-analytics.com/j/collect"
  
  private val uri02 = "https://booking.mightycampers.com"
  
  private val uri03 = "https://stats.g.doubleclick.net/j/collect"
  
  private val uri05 = "https://www.googletagmanager.com/gtm.js"
  
  private val uri07 = "https://931-unc-079.mktoresp.com/webevents/visitWebPage"
  
  private val uri08 = "https://9370674.fls.doubleclick.net"
  
  private val uri09 = "https://thl.widen.net/content"
  
  private val uri10 = "https://app-sn03.marketo.com/index.php/form"
  
  private val uri11 = "https://booking.thlonline.com/api/get"
  
  private val uri12 = "https://googleads.g.doubleclick.net/pagead/viewthroughconversion/982569359"
  
  private val uri13 = "https://www.britz.com/api/get/booking-component/build"
  
  private val uri16 = "https://fonts.googleapis.com/css"

private val bookingSearch =
      exec(http("getBookingResultPage")
        .get(uri02 + "/search?cc=nz&pb=AKL&db=AKL&pd=01&pm=09&py=2022&dd=30&dm=09&dy=2022&na=2&nc=1&cr=NZ&promoCode=0630")
        .headers(headers_0)
        .resources(
          http("request_1")
            .get(uri05 + "?id=GTM-M9L9QBQ")
            .headers(headers_1),
          http("request_2")
            .get(uri13)
            .headers(headers_2),
          http("getVehiclesBuild")
            .get(uri11 + "/vehicles/build")
            .headers(headers_3),
          http("request_4")
            .get(uri08 + "/activityi;src=9370674;type=micount;cat=might0;ord=4473694617296;gtm=2wg880;auiddc=161667327.1660178816;~oref=https%3A%2F%2Fbooking.mightycampers.com%2Fsearch%3Fcc%3Dnz%26pb%3DAKL%26db%3DAKL%26pd%3D01%26pm%3D09%26py%3D2022%26dd%3D30%26dm%3D09%26dy%3D2022%26na%3D2%26nc%3D1%26cr%3DNZ%26promoCode%3D0630?")
            .headers(headers_4),
          http("request_5")
            .get(uri02 + "/images/nz-outline.svg"),
          http("request_6")
            .get(uri08 + "/activityi;dc_pre=CNO_0bSlvvkCFUhTvQodlukBLQ;src=9370674;type=micount;cat=might0;ord=4473694617296;gtm=2wg880;auiddc=161667327.1660178816;~oref=https%3A%2F%2Fbooking.mightycampers.com%2Fsearch%3Fcc%3Dnz%26pb%3DAKL%26db%3DAKL%26pd%3D01%26pm%3D09%26py%3D2022%26dd%3D30%26dm%3D09%26dy%3D2022%26na%3D2%26nc%3D1%26cr%3DNZ%26promoCode%3D0630?")
            .headers(headers_4),
          http("request_7")
            .get(uri08 + "/activityi;dc_pre=CP7L1rSlvvkCFQnGvQodnpgKmg;src=9370674;type=miremktg;cat=might0;ord=6461689612325;gtm=2wg880;auiddc=161667327.1660178816;u2=%2Fsearch;~oref=https%3A%2F%2Fbooking.mightycampers.com%2Fsearch%3Fcc%3Dnz%26pb%3DAKL%26db%3DAKL%26pd%3D01%26pm%3D09%26py%3D2022%26dd%3D30%26dm%3D09%26dy%3D2022%26na%3D2%26nc%3D1%26cr%3DNZ%26promoCode%3D0630?")
            .headers(headers_4),
          http("getLocations")
            .get("/api/2/locations")
            .headers(headers_8),
          http("getExtras")
            .get(uri11 + "/extras")
            .headers(headers_3),
          http("request_10")
            .get(uri12 + "/?random=1660203882798&cv=9&fst=1660203882798&num=1&bg=ffffff&guid=ON&resp=GooglemKTybQhCsO&eid=376635471&u_h=864&u_w=1536&u_ah=834&u_aw=1536&u_cd=24&u_his=1&u_tz=480&u_java=false&u_nplug=5&u_nmime=2&gtm=2wg880&sendb=1&ig=1&frm=0&url=https%3A%2F%2Fbooking.mightycampers.com%2Fsearch%3Fcc%3Dnz%26pb%3DAKL%26db%3DAKL%26pd%3D01%26pm%3D09%26py%3D2022%26dd%3D30%26dm%3D09%26dy%3D2022%26na%3D2%26nc%3D1%26cr%3DNZ%26promoCode%3D0630&tiba=Mighty%20New%20Zealand%20%7C%20real-time%20campervan%20search&auid=161667327.1660178816&hn=www.googleadservices.com&async=1&rfmt=3&fmt=4")
            .headers(headers_10),
          http("request_11")
            .post(uri01 + "?v=1&_v=j96&a=1411071492&t=pageview&_s=1&dl=https%3A%2F%2Fbooking.mightycampers.com%2Fsearch%3Fcc%3Dnz%26pb%3DAKL%26db%3DAKL%26pd%3D01%26pm%3D09%26py%3D2022%26dd%3D30%26dm%3D09%26dy%3D2022%26na%3D2%26nc%3D1%26cr%3DNZ%26promoCode%3D0630&ul=en-nz&de=UTF-8&dt=Mighty%20New%20Zealand%20%7C%20real-time%20campervan%20search&sd=24-bit&sr=1536x864&vp=974x763&je=0&_u=QACAAEABAAAAAC~&jid=1271410726&gjid=1020107590&cid=394422774.1660178819&tid=UA-4028861-1&_gid=499667737.1660178819&_r=1&gtm=2wg880M9L9QBQ&z=254966674")
            .headers(headers_11),
          http("request_12")
            .post(uri03 + "?t=dc&aip=1&_r=3&v=1&_v=j96&tid=UA-4028861-1&cid=394422774.1660178819&jid=1271410726&gjid=1020107590&_gid=499667737.1660178819&_u=QACAAEAAAAAAAC~&z=1034358421")
            .headers(headers_12),
          http("marketo1")
            .get(uri10 + "/getForm?munchkinId=931-UNC-079&form=234&url=https%3A%2F%2Fbooking.mightycampers.com%2Fsearch&callback=jQuery112400794229519938956_1660203881125&_=1660203881126")
            .headers(headers_1),
          http("marketo2")
            .get(uri10 + "/XDFrame"),
          http("getFullBookingRequest")
            .get("/api/2/availability/pricing?sessionId=116c5f76-ee8c-4025-b129-7e724c886623&countryCode=NZ&checkoutLocationCode=AKL&checkoutDateTime=2022-09-01T11:00&checkinLocationCode=AKL&checkinDateTime=2022-09-30T12:00&countryOfResidence=NZ&numberOfAdults=2&numberOfChildren=1&agentCode=B2CNZ&isVan=true&isBestBuy=true&isGross=true&isInclusiveProduct=true&promoCode=0630")
            .headers(headers_8),
          http("request_16")
            .post(uri07 + "?_mchNc=1660203883110&_mchCn=&_mchId=931-UNC-079&_mchTk=_mch-mightycampers.com-1660178856087-19976&_mchWs=jFRQ&_mchHo=booking.mightycampers.com&_mchPo=&_mchRu=%2Fsearch&_mchPc=https%3A&_mchVr=161&_mchEcid=&_mchHa=&_mchRe=&_mchQp=cc%3Dnz__-__pb%3DAKL__-__db%3DAKL__-__pd%3D01__-__pm%3D09__-__py%3D2022__-__dd%3D30__-__dm%3D09__-__dy%3D2022__-__na%3D2__-__nc%3D1__-__cr%3DNZ__-__promoCode%3D0630")
            .headers(headers_16),
          http("request_17")
            .get(uri09 + "/0dfmqfdnxt/jpeg/nz-Mighty-4YX.jpg?crop=true&keep=c&q=80&color=ffffffff&u=gvvvh2&w=550&h=250")
            .headers(headers_17),
          http("request_18")
            .get(uri09 + "/mth1vthpik/jpeg/nz-maui-3BTSM.jpg?crop=true&keep=c&q=80&color=ffffffff&u=gvvvh2&w=550&h=250")
            .headers(headers_17),
          http("request_19")
            .get(uri09 + "/ibctee5w8x/jpeg/nz-Mighty-2YX.jpg?crop=true&keep=c&q=80&color=ffffffff&u=gvvvh2&w=550&h=250")
            .headers(headers_17),
          http("request_20")
            .get(uri09 + "/tdwvbvaeb9/jpeg/nz-maui-3BTSME.jpg?crop=true&keep=c&q=80&color=ffffffff&u=gvvvh2&w=550&h=250")
            .headers(headers_17),
          http("request_21")
            .get(uri09 + "/wvdeww75ez/jpeg/nz-Mighty-3Y.jpg?crop=true&keep=c&q=80&color=ffffffff&u=gvvvh2&w=550&h=250")
            .headers(headers_17),
          http("request_22")
            .get(uri09 + "/w1rytmgne3/jpeg/nz-maui-4BMAE.jpg?crop=true&keep=c&q=80&color=ffffffff&u=gvvvh2&w=550&h=250")
            .headers(headers_17),
          http("request_23")
            .get(uri09 + "/srneeauuzu/jpeg/nz-maui-4BMA.jpg?crop=true&keep=c&q=80&color=ffffffff&u=gvvvh2&w=550&h=250")
            .headers(headers_17),
          http("request_24")
            .get(uri09 + "/f0ygb8er5c/jpeg/nz-Mighty-4Y.jpg?crop=true&keep=c&q=80&color=ffffffff&u=gvvvh2&w=550&h=250")
            .headers(headers_17),
          http("request_25")
            .get(uri09 + "/ogz14s54lz/jpeg/nz-Mighty-6Y.jpg?crop=true&keep=c&q=80&color=ffffffff&u=gvvvh2&w=550&h=250")
            .headers(headers_17),
          http("request_26")
            .get(uri09 + "/of9xb4czkk/jpeg/nz-britz-4BBXS.jpg?crop=true&keep=c&q=80&color=ffffffff&u=gvvvh2&w=550&h=250")
            .headers(headers_17),
          http("request_27")
            .get(uri09 + "/ifd0zyaopb/jpeg/nz-britz-4BTSD.jpg?crop=true&keep=c&q=80&color=ffffffff&u=gvvvh2&w=550&h=250")
            .headers(headers_17),
          http("request_28")
            .get(uri09 + "/cikeckt3t5/jpeg/nz-britz-2bb.jpg?crop=true&keep=c&q=80&color=ffffffff&u=gvvvh2&w=550&h=250")
            .headers(headers_17),
          http("request_29")
            .get(uri09 + "/cvj9rarvxa/jpeg/nz-britz-3BTS.jpg?crop=true&keep=c&q=80&color=ffffffff&u=gvvvh2&w=550&h=250")
            .headers(headers_17),
          http("request_30")
            .get(uri09 + "/lyatfvtra2/jpeg/nz-britz-4BB.jpg?crop=true&keep=c&q=80&color=ffffffff&u=gvvvh2&w=550&h=250")
            .headers(headers_17),
          http("request_31")
            .get(uri09 + "/8kctzorqyc/jpeg/nz-britz-6BB.jpg?crop=true&keep=c&q=80&color=ffffffff&u=gvvvh2&w=550&h=250")
            .headers(headers_17)
        ).check(status.is(session =>200)))
        .pause(13);

private val feeder = csv("uuid.csv").random

private val bookingBrowse =
  repeat(3, "n") {
  feed(feeder)
  .exec(http("getBookingDetails #{n}").get("/api/2/availability/pricing/calculated/#{calculatedId}?sessionId=#{sessionId}&countryCode=nz&external=false")
  .headers(headers_8)
  .check(status.is(session => 200)))
  .pause(5)}


private val scn = scenario("BookChecking")
  .exec(bookingSearch, bookingBrowse);

  setUp(
  // scn.inject(rampUsers(10).during(10))//users-10-20
  scn.inject(rampUsers(20).during(10))//users-10-20
).protocols(httpProtocol)

}
