package readMsg;
import microsoft.exchange.webservices.data.core.ExchangeService;
import microsoft.exchange.webservices.data.core.PropertySet;
import microsoft.exchange.webservices.data.core.enumeration.misc.ExchangeVersion;
import microsoft.exchange.webservices.data.core.enumeration.property.WellKnownFolderName;
import microsoft.exchange.webservices.data.core.enumeration.search.LogicalOperator;
import microsoft.exchange.webservices.data.core.service.item.EmailMessage;
import microsoft.exchange.webservices.data.core.service.item.Item;
import microsoft.exchange.webservices.data.core.service.schema.ItemSchema;
import microsoft.exchange.webservices.data.credential.ExchangeCredentials;
import microsoft.exchange.webservices.data.credential.WebCredentials;
import microsoft.exchange.webservices.data.property.complex.FileAttachment;
import microsoft.exchange.webservices.data.search.ItemView;

import microsoft.exchange.webservices.data.core.service.folder.Folder;
import microsoft.exchange.webservices.data.search.filter.SearchFilter;
import org.springframework.util.CollectionUtils;

import java.net.URI;
import java.util.ArrayList;
import java.util.List;

@SuppressWarnings("unused")
public class ReadOutlookMail {
    public static void main(String[] args) {
        try {
            ExchangeService service = createConnection();
            readAttachmentEmail(service);
        } catch (Exception e) {
           
            e.printStackTrace();
        }
    }

    private static ExchangeService createConnection() throws Exception {
        String email = "testu5263@gmail.com";
        String password= "Test@4321";
        ExchangeService service = new ExchangeService(ExchangeVersion.Exchange2010_SP2);
        ExchangeCredentials credentials = new WebCredentials(email, password);
        service.setUrl(new URI(""));
        service.setCredentials(credentials);
        return service;
    }

    private static void readAttachmentEmail(ExchangeService service) throws Exception {
        // Bind to the Inbox.
        Folder inbox = Folder.bind(service, WellKnownFolderName.Inbox);
        // set number of items you want to retrieve
        ItemView view = new ItemView(1);
        List<SearchFilter> searchFilterCollection = new ArrayList<>();
        searchFilterCollection.add(new SearchFilter.IsEqualTo(ItemSchema.Subject, Boolean.TRUE));
        searchFilterCollection.add(new SearchFilter.ContainsSubstring(ItemSchema.Subject,"RFT: FSPP-39944"));
        SearchFilter finalSearchFilter = new SearchFilter.SearchFilterCollection(LogicalOperator.And, searchFilterCollection);
        ArrayList<Item> items =  service.findItems(inbox.getId(), finalSearchFilter, view).getItems();
        if(!CollectionUtils.isEmpty(items)) {
            Item item= items.get(1);
            System.out.println("id==========" + item.getDateTimeReceived());
            System.out.println("sub==========" + item.getSubject());
           // EmailMessage message = EmailMessage.bind(service, item.getId(), new PropertySet(ItemSchema.Attachments));
           // FileAttachment attachment = (FileAttachment) message.getAttachments().getItems().get(0);
           // attachment.load(" < attachment save directory > "+attachment.getName());
        }

    }
}


