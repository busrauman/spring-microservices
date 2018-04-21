# microservices

Mikroservis mimarisi kendi kendine yetebilen(self-contained), tek sorumluluğu(single-resposibilities) olan mikro düzeyde uygulamalardır.
Yapısal olarak monolotik yapıya alternatif bir yapıdır. 
Mikroservisler birbirlerinden bağımsız olarak farklı platformlarda da geliştirilebilinen yapılardır.
Mikroservisler hiç bir nesnenin durumunu tutmazlar. Http ile haberleşirler.
Her bir mikroservis modülünün geliştirlmesi ve deploy aşaması birbirinden bağımsızdır. 
Her servis birbirinden bağımsız çalıştığından ve geliştirildiğinden dolayı aksaklık olan kısımda yalnızca 
o modül etkilecek ve diğer modüllerin çalışması aksamayacaktır.
