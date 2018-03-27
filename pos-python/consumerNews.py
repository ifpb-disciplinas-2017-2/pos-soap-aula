from suds.client import Client
from suds.cache import NoCache
url="http://localhost:8080/pos-news/NewsSOAPService?wsdl"
client = Client(url, cache=NoCache())
# news = {
#     'id': '0',
#     'title':'JS in veia!!! :)))) ',
#     'auth':'Deitel',
#     'body':'Java is poor'
# }
class News:
    def __init__(self, title, auth, body ):
        self.title = title
        self.auth = auth
        self.body = body
        
news = News('Sample 2','too', 'too de novo')
#invocando os metodos
# client.service.persist(news)
print client.service.all()
#print client

