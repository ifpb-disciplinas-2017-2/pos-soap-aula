var soap = require('soap');
// var url = 'http://localhost:8080/pos-soap-server/CalculadoraService?wsdl';
var url = "http://localhost:8080/CalculadoraSOAPService/CalculadoraSOAP?wsdl"
var primeiro = {'a':2, 'b':4};
var segundo = {'a':9, 'b':4};
soap.WSDL.prototype.ignoredNamespaces = [];
soap.createClient(url, function(err, client) {
    client.somarSOAP(primeiro,function(err,result,res){
         console.log('Método somar:',result.return);
         console.log('Retorno:',result);
    })
    client.subtrair(segundo,function(err,result,res){
         console.log('Método subtrair:',result.return);
         console.log('Retorno:',result);
         console.log('Resposta:',res);
    })
});


// var client = soap.createClient(url)
// var retorno = client.somarSOAP(primeiro);
// var resultado = retorno.return;
