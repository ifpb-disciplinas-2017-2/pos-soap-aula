var soap = require('soap');
var url="http://localhost:8080/pos-news/NewsSOAPService?wsdl"   
news = {
        'arg0':{
          'id': '0',
          'title':'Java in veia!!! :)))) ',
          'auth':'afdafasfa',
          'body':'Java is greatttt!!!!!!!!!!'
        }
}
soap.WSDL.prototype.ignoredNamespaces = ['http://service.ifpb.edu.br/'];
soap.createClient(url, function(err, client) {
    client.persist(news, function(err,result,res){
         console.log('Retorno:',res);
        //  client.all(function(err,result,res){
        //       console.log(result.return);
        //  })
    })
    client.all(function(err,result,res){
         console.log(result.return);
         console.log('Retorno:',result);
    })
});
