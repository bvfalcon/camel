/* Generated by camel build tools - do NOT edit this file! */
package org.apache.camel.component.mail;

import java.util.Map;

import org.apache.camel.CamelContext;
import org.apache.camel.spi.ExtendedPropertyConfigurerGetter;
import org.apache.camel.spi.PropertyConfigurerGetter;
import org.apache.camel.spi.ConfigurerStrategy;
import org.apache.camel.spi.GeneratedPropertyConfigurer;
import org.apache.camel.util.CaseInsensitiveMap;
import org.apache.camel.support.component.PropertyConfigurerSupport;

/**
 * Generated by camel build tools - do NOT edit this file!
 */
@SuppressWarnings("unchecked")
public class MailEndpointConfigurer extends PropertyConfigurerSupport implements GeneratedPropertyConfigurer, PropertyConfigurerGetter {

    @Override
    public boolean configure(CamelContext camelContext, Object obj, String name, Object value, boolean ignoreCase) {
        MailEndpoint target = (MailEndpoint) obj;
        switch (ignoreCase ? name.toLowerCase() : name) {
        case "additionaljavamailproperties":
        case "additionalJavaMailProperties": target.getConfiguration().setAdditionalJavaMailProperties(property(camelContext, java.util.Properties.class, value)); return true;
        case "alternativebodyheader":
        case "alternativeBodyHeader": target.getConfiguration().setAlternativeBodyHeader(property(camelContext, java.lang.String.class, value)); return true;
        case "attachmentscontenttransferencodingresolver":
        case "attachmentsContentTransferEncodingResolver": target.getConfiguration().setAttachmentsContentTransferEncodingResolver(property(camelContext, org.apache.camel.component.mail.AttachmentsContentTransferEncodingResolver.class, value)); return true;
        case "authenticator": target.getConfiguration().setAuthenticator(property(camelContext, org.apache.camel.component.mail.MailAuthenticator.class, value)); return true;
        case "backofferrorthreshold":
        case "backoffErrorThreshold": target.setBackoffErrorThreshold(property(camelContext, int.class, value)); return true;
        case "backoffidlethreshold":
        case "backoffIdleThreshold": target.setBackoffIdleThreshold(property(camelContext, int.class, value)); return true;
        case "backoffmultiplier":
        case "backoffMultiplier": target.setBackoffMultiplier(property(camelContext, int.class, value)); return true;
        case "bcc": target.getConfiguration().setBcc(property(camelContext, java.lang.String.class, value)); return true;
        case "binding": target.setBinding(property(camelContext, org.apache.camel.component.mail.MailBinding.class, value)); return true;
        case "bridgeerrorhandler":
        case "bridgeErrorHandler": target.setBridgeErrorHandler(property(camelContext, boolean.class, value)); return true;
        case "cc": target.getConfiguration().setCc(property(camelContext, java.lang.String.class, value)); return true;
        case "closefolder":
        case "closeFolder": target.getConfiguration().setCloseFolder(property(camelContext, boolean.class, value)); return true;
        case "connectiontimeout":
        case "connectionTimeout": target.getConfiguration().setConnectionTimeout(property(camelContext, int.class, value)); return true;
        case "contenttype":
        case "contentType": target.getConfiguration().setContentType(property(camelContext, java.lang.String.class, value)); return true;
        case "contenttyperesolver":
        case "contentTypeResolver": target.setContentTypeResolver(property(camelContext, org.apache.camel.component.mail.ContentTypeResolver.class, value)); return true;
        case "copyto":
        case "copyTo": target.getConfiguration().setCopyTo(property(camelContext, java.lang.String.class, value)); return true;
        case "debugmode":
        case "debugMode": target.getConfiguration().setDebugMode(property(camelContext, boolean.class, value)); return true;
        case "decodefilename":
        case "decodeFilename": target.getConfiguration().setDecodeFilename(property(camelContext, boolean.class, value)); return true;
        case "delay": target.setDelay(property(camelContext, java.time.Duration.class, value).toMillis()); return true;
        case "delete": target.getConfiguration().setDelete(property(camelContext, boolean.class, value)); return true;
        case "disconnect": target.getConfiguration().setDisconnect(property(camelContext, boolean.class, value)); return true;
        case "exceptionhandler":
        case "exceptionHandler": target.setExceptionHandler(property(camelContext, org.apache.camel.spi.ExceptionHandler.class, value)); return true;
        case "exchangepattern":
        case "exchangePattern": target.setExchangePattern(property(camelContext, org.apache.camel.ExchangePattern.class, value)); return true;
        case "failonduplicatefileattachment":
        case "failOnDuplicateFileAttachment": target.getConfiguration().setFailOnDuplicateFileAttachment(property(camelContext, boolean.class, value)); return true;
        case "fetchsize":
        case "fetchSize": target.getConfiguration().setFetchSize(property(camelContext, int.class, value)); return true;
        case "foldername":
        case "folderName": target.getConfiguration().setFolderName(property(camelContext, java.lang.String.class, value)); return true;
        case "from": target.getConfiguration().setFrom(property(camelContext, java.lang.String.class, value)); return true;
        case "generatemissingattachmentnames":
        case "generateMissingAttachmentNames": target.getConfiguration().setGenerateMissingAttachmentNames(property(camelContext, java.lang.String.class, value)); return true;
        case "greedy": target.setGreedy(property(camelContext, boolean.class, value)); return true;
        case "handleduplicateattachmentnames":
        case "handleDuplicateAttachmentNames": target.getConfiguration().setHandleDuplicateAttachmentNames(property(camelContext, java.lang.String.class, value)); return true;
        case "handlefailedmessage":
        case "handleFailedMessage": target.getConfiguration().setHandleFailedMessage(property(camelContext, boolean.class, value)); return true;
        case "headerfilterstrategy":
        case "headerFilterStrategy": target.setHeaderFilterStrategy(property(camelContext, org.apache.camel.spi.HeaderFilterStrategy.class, value)); return true;
        case "idempotentrepository":
        case "idempotentRepository": target.setIdempotentRepository(property(camelContext, org.apache.camel.spi.IdempotentRepository.class, value)); return true;
        case "idempotentrepositoryremoveoncommit":
        case "idempotentRepositoryRemoveOnCommit": target.setIdempotentRepositoryRemoveOnCommit(property(camelContext, boolean.class, value)); return true;
        case "ignoreunsupportedcharset":
        case "ignoreUnsupportedCharset": target.getConfiguration().setIgnoreUnsupportedCharset(property(camelContext, boolean.class, value)); return true;
        case "ignoreurischeme":
        case "ignoreUriScheme": target.getConfiguration().setIgnoreUriScheme(property(camelContext, boolean.class, value)); return true;
        case "initialdelay":
        case "initialDelay": target.setInitialDelay(property(camelContext, long.class, value)); return true;
        case "javamailproperties":
        case "javaMailProperties": target.getConfiguration().setJavaMailProperties(property(camelContext, java.util.Properties.class, value)); return true;
        case "javamailsender":
        case "javaMailSender": target.getConfiguration().setJavaMailSender(property(camelContext, org.apache.camel.component.mail.JavaMailSender.class, value)); return true;
        case "lazystartproducer":
        case "lazyStartProducer": target.setLazyStartProducer(property(camelContext, boolean.class, value)); return true;
        case "mailuidgenerator":
        case "mailUidGenerator": target.setMailUidGenerator(property(camelContext, org.apache.camel.component.mail.MailUidGenerator.class, value)); return true;
        case "mapmailmessage":
        case "mapMailMessage": target.getConfiguration().setMapMailMessage(property(camelContext, boolean.class, value)); return true;
        case "maxmessagesperpoll":
        case "maxMessagesPerPoll": target.setMaxMessagesPerPoll(property(camelContext, int.class, value)); return true;
        case "mimedecodeheaders":
        case "mimeDecodeHeaders": target.getConfiguration().setMimeDecodeHeaders(property(camelContext, boolean.class, value)); return true;
        case "moveto":
        case "moveTo": target.getConfiguration().setMoveTo(property(camelContext, java.lang.String.class, value)); return true;
        case "password": target.getConfiguration().setPassword(property(camelContext, java.lang.String.class, value)); return true;
        case "peek": target.getConfiguration().setPeek(property(camelContext, boolean.class, value)); return true;
        case "pollstrategy":
        case "pollStrategy": target.setPollStrategy(property(camelContext, org.apache.camel.spi.PollingConsumerPollStrategy.class, value)); return true;
        case "postprocessaction":
        case "postProcessAction": target.setPostProcessAction(property(camelContext, org.apache.camel.component.mail.MailBoxPostProcessAction.class, value)); return true;
        case "repeatcount":
        case "repeatCount": target.setRepeatCount(property(camelContext, long.class, value)); return true;
        case "replyto":
        case "replyTo": target.getConfiguration().setReplyTo(property(camelContext, java.lang.String.class, value)); return true;
        case "runlogginglevel":
        case "runLoggingLevel": target.setRunLoggingLevel(property(camelContext, org.apache.camel.LoggingLevel.class, value)); return true;
        case "scheduledexecutorservice":
        case "scheduledExecutorService": target.setScheduledExecutorService(property(camelContext, java.util.concurrent.ScheduledExecutorService.class, value)); return true;
        case "scheduler": target.setScheduler(property(camelContext, java.lang.Object.class, value)); return true;
        case "schedulerproperties":
        case "schedulerProperties": target.setSchedulerProperties(property(camelContext, java.util.Map.class, value)); return true;
        case "searchterm":
        case "searchTerm": target.setSearchTerm(property(camelContext, jakarta.mail.search.SearchTerm.class, value)); return true;
        case "sendemptymessagewhenidle":
        case "sendEmptyMessageWhenIdle": target.setSendEmptyMessageWhenIdle(property(camelContext, boolean.class, value)); return true;
        case "session": target.getConfiguration().setSession(property(camelContext, jakarta.mail.Session.class, value)); return true;
        case "skipfailedmessage":
        case "skipFailedMessage": target.getConfiguration().setSkipFailedMessage(property(camelContext, boolean.class, value)); return true;
        case "sortterm":
        case "sortTerm": target.setSortTerm(property(camelContext, com.sun.mail.imap.SortTerm[].class, value)); return true;
        case "sslcontextparameters":
        case "sslContextParameters": target.getConfiguration().setSslContextParameters(property(camelContext, org.apache.camel.support.jsse.SSLContextParameters.class, value)); return true;
        case "startscheduler":
        case "startScheduler": target.setStartScheduler(property(camelContext, boolean.class, value)); return true;
        case "subject": target.getConfiguration().setSubject(property(camelContext, java.lang.String.class, value)); return true;
        case "timeunit":
        case "timeUnit": target.setTimeUnit(property(camelContext, java.util.concurrent.TimeUnit.class, value)); return true;
        case "to": target.getConfiguration().setTo(property(camelContext, java.lang.String.class, value)); return true;
        case "unseen": target.getConfiguration().setUnseen(property(camelContext, boolean.class, value)); return true;
        case "usefixeddelay":
        case "useFixedDelay": target.setUseFixedDelay(property(camelContext, boolean.class, value)); return true;
        case "useinlineattachments":
        case "useInlineAttachments": target.getConfiguration().setUseInlineAttachments(property(camelContext, boolean.class, value)); return true;
        case "username": target.getConfiguration().setUsername(property(camelContext, java.lang.String.class, value)); return true;
        default: return false;
        }
    }

    @Override
    public Class<?> getOptionType(String name, boolean ignoreCase) {
        switch (ignoreCase ? name.toLowerCase() : name) {
        case "additionaljavamailproperties":
        case "additionalJavaMailProperties": return java.util.Properties.class;
        case "alternativebodyheader":
        case "alternativeBodyHeader": return java.lang.String.class;
        case "attachmentscontenttransferencodingresolver":
        case "attachmentsContentTransferEncodingResolver": return org.apache.camel.component.mail.AttachmentsContentTransferEncodingResolver.class;
        case "authenticator": return org.apache.camel.component.mail.MailAuthenticator.class;
        case "backofferrorthreshold":
        case "backoffErrorThreshold": return int.class;
        case "backoffidlethreshold":
        case "backoffIdleThreshold": return int.class;
        case "backoffmultiplier":
        case "backoffMultiplier": return int.class;
        case "bcc": return java.lang.String.class;
        case "binding": return org.apache.camel.component.mail.MailBinding.class;
        case "bridgeerrorhandler":
        case "bridgeErrorHandler": return boolean.class;
        case "cc": return java.lang.String.class;
        case "closefolder":
        case "closeFolder": return boolean.class;
        case "connectiontimeout":
        case "connectionTimeout": return int.class;
        case "contenttype":
        case "contentType": return java.lang.String.class;
        case "contenttyperesolver":
        case "contentTypeResolver": return org.apache.camel.component.mail.ContentTypeResolver.class;
        case "copyto":
        case "copyTo": return java.lang.String.class;
        case "debugmode":
        case "debugMode": return boolean.class;
        case "decodefilename":
        case "decodeFilename": return boolean.class;
        case "delay": return long.class;
        case "delete": return boolean.class;
        case "disconnect": return boolean.class;
        case "exceptionhandler":
        case "exceptionHandler": return org.apache.camel.spi.ExceptionHandler.class;
        case "exchangepattern":
        case "exchangePattern": return org.apache.camel.ExchangePattern.class;
        case "failonduplicatefileattachment":
        case "failOnDuplicateFileAttachment": return boolean.class;
        case "fetchsize":
        case "fetchSize": return int.class;
        case "foldername":
        case "folderName": return java.lang.String.class;
        case "from": return java.lang.String.class;
        case "generatemissingattachmentnames":
        case "generateMissingAttachmentNames": return java.lang.String.class;
        case "greedy": return boolean.class;
        case "handleduplicateattachmentnames":
        case "handleDuplicateAttachmentNames": return java.lang.String.class;
        case "handlefailedmessage":
        case "handleFailedMessage": return boolean.class;
        case "headerfilterstrategy":
        case "headerFilterStrategy": return org.apache.camel.spi.HeaderFilterStrategy.class;
        case "idempotentrepository":
        case "idempotentRepository": return org.apache.camel.spi.IdempotentRepository.class;
        case "idempotentrepositoryremoveoncommit":
        case "idempotentRepositoryRemoveOnCommit": return boolean.class;
        case "ignoreunsupportedcharset":
        case "ignoreUnsupportedCharset": return boolean.class;
        case "ignoreurischeme":
        case "ignoreUriScheme": return boolean.class;
        case "initialdelay":
        case "initialDelay": return long.class;
        case "javamailproperties":
        case "javaMailProperties": return java.util.Properties.class;
        case "javamailsender":
        case "javaMailSender": return org.apache.camel.component.mail.JavaMailSender.class;
        case "lazystartproducer":
        case "lazyStartProducer": return boolean.class;
        case "mailuidgenerator":
        case "mailUidGenerator": return org.apache.camel.component.mail.MailUidGenerator.class;
        case "mapmailmessage":
        case "mapMailMessage": return boolean.class;
        case "maxmessagesperpoll":
        case "maxMessagesPerPoll": return int.class;
        case "mimedecodeheaders":
        case "mimeDecodeHeaders": return boolean.class;
        case "moveto":
        case "moveTo": return java.lang.String.class;
        case "password": return java.lang.String.class;
        case "peek": return boolean.class;
        case "pollstrategy":
        case "pollStrategy": return org.apache.camel.spi.PollingConsumerPollStrategy.class;
        case "postprocessaction":
        case "postProcessAction": return org.apache.camel.component.mail.MailBoxPostProcessAction.class;
        case "repeatcount":
        case "repeatCount": return long.class;
        case "replyto":
        case "replyTo": return java.lang.String.class;
        case "runlogginglevel":
        case "runLoggingLevel": return org.apache.camel.LoggingLevel.class;
        case "scheduledexecutorservice":
        case "scheduledExecutorService": return java.util.concurrent.ScheduledExecutorService.class;
        case "scheduler": return java.lang.Object.class;
        case "schedulerproperties":
        case "schedulerProperties": return java.util.Map.class;
        case "searchterm":
        case "searchTerm": return jakarta.mail.search.SearchTerm.class;
        case "sendemptymessagewhenidle":
        case "sendEmptyMessageWhenIdle": return boolean.class;
        case "session": return jakarta.mail.Session.class;
        case "skipfailedmessage":
        case "skipFailedMessage": return boolean.class;
        case "sortterm":
        case "sortTerm": return com.sun.mail.imap.SortTerm[].class;
        case "sslcontextparameters":
        case "sslContextParameters": return org.apache.camel.support.jsse.SSLContextParameters.class;
        case "startscheduler":
        case "startScheduler": return boolean.class;
        case "subject": return java.lang.String.class;
        case "timeunit":
        case "timeUnit": return java.util.concurrent.TimeUnit.class;
        case "to": return java.lang.String.class;
        case "unseen": return boolean.class;
        case "usefixeddelay":
        case "useFixedDelay": return boolean.class;
        case "useinlineattachments":
        case "useInlineAttachments": return boolean.class;
        case "username": return java.lang.String.class;
        default: return null;
        }
    }

    @Override
    public Object getOptionValue(Object obj, String name, boolean ignoreCase) {
        MailEndpoint target = (MailEndpoint) obj;
        switch (ignoreCase ? name.toLowerCase() : name) {
        case "additionaljavamailproperties":
        case "additionalJavaMailProperties": return target.getConfiguration().getAdditionalJavaMailProperties();
        case "alternativebodyheader":
        case "alternativeBodyHeader": return target.getConfiguration().getAlternativeBodyHeader();
        case "attachmentscontenttransferencodingresolver":
        case "attachmentsContentTransferEncodingResolver": return target.getConfiguration().getAttachmentsContentTransferEncodingResolver();
        case "authenticator": return target.getConfiguration().getAuthenticator();
        case "backofferrorthreshold":
        case "backoffErrorThreshold": return target.getBackoffErrorThreshold();
        case "backoffidlethreshold":
        case "backoffIdleThreshold": return target.getBackoffIdleThreshold();
        case "backoffmultiplier":
        case "backoffMultiplier": return target.getBackoffMultiplier();
        case "bcc": return target.getConfiguration().getBcc();
        case "binding": return target.getBinding();
        case "bridgeerrorhandler":
        case "bridgeErrorHandler": return target.isBridgeErrorHandler();
        case "cc": return target.getConfiguration().getCc();
        case "closefolder":
        case "closeFolder": return target.getConfiguration().isCloseFolder();
        case "connectiontimeout":
        case "connectionTimeout": return target.getConfiguration().getConnectionTimeout();
        case "contenttype":
        case "contentType": return target.getConfiguration().getContentType();
        case "contenttyperesolver":
        case "contentTypeResolver": return target.getContentTypeResolver();
        case "copyto":
        case "copyTo": return target.getConfiguration().getCopyTo();
        case "debugmode":
        case "debugMode": return target.getConfiguration().isDebugMode();
        case "decodefilename":
        case "decodeFilename": return target.getConfiguration().isDecodeFilename();
        case "delay": return target.getDelay();
        case "delete": return target.getConfiguration().isDelete();
        case "disconnect": return target.getConfiguration().isDisconnect();
        case "exceptionhandler":
        case "exceptionHandler": return target.getExceptionHandler();
        case "exchangepattern":
        case "exchangePattern": return target.getExchangePattern();
        case "failonduplicatefileattachment":
        case "failOnDuplicateFileAttachment": return target.getConfiguration().isFailOnDuplicateFileAttachment();
        case "fetchsize":
        case "fetchSize": return target.getConfiguration().getFetchSize();
        case "foldername":
        case "folderName": return target.getConfiguration().getFolderName();
        case "from": return target.getConfiguration().getFrom();
        case "generatemissingattachmentnames":
        case "generateMissingAttachmentNames": return target.getConfiguration().getGenerateMissingAttachmentNames();
        case "greedy": return target.isGreedy();
        case "handleduplicateattachmentnames":
        case "handleDuplicateAttachmentNames": return target.getConfiguration().getHandleDuplicateAttachmentNames();
        case "handlefailedmessage":
        case "handleFailedMessage": return target.getConfiguration().isHandleFailedMessage();
        case "headerfilterstrategy":
        case "headerFilterStrategy": return target.getHeaderFilterStrategy();
        case "idempotentrepository":
        case "idempotentRepository": return target.getIdempotentRepository();
        case "idempotentrepositoryremoveoncommit":
        case "idempotentRepositoryRemoveOnCommit": return target.isIdempotentRepositoryRemoveOnCommit();
        case "ignoreunsupportedcharset":
        case "ignoreUnsupportedCharset": return target.getConfiguration().isIgnoreUnsupportedCharset();
        case "ignoreurischeme":
        case "ignoreUriScheme": return target.getConfiguration().isIgnoreUriScheme();
        case "initialdelay":
        case "initialDelay": return target.getInitialDelay();
        case "javamailproperties":
        case "javaMailProperties": return target.getConfiguration().getJavaMailProperties();
        case "javamailsender":
        case "javaMailSender": return target.getConfiguration().getJavaMailSender();
        case "lazystartproducer":
        case "lazyStartProducer": return target.isLazyStartProducer();
        case "mailuidgenerator":
        case "mailUidGenerator": return target.getMailUidGenerator();
        case "mapmailmessage":
        case "mapMailMessage": return target.getConfiguration().isMapMailMessage();
        case "maxmessagesperpoll":
        case "maxMessagesPerPoll": return target.getMaxMessagesPerPoll();
        case "mimedecodeheaders":
        case "mimeDecodeHeaders": return target.getConfiguration().isMimeDecodeHeaders();
        case "moveto":
        case "moveTo": return target.getConfiguration().getMoveTo();
        case "password": return target.getConfiguration().getPassword();
        case "peek": return target.getConfiguration().isPeek();
        case "pollstrategy":
        case "pollStrategy": return target.getPollStrategy();
        case "postprocessaction":
        case "postProcessAction": return target.getPostProcessAction();
        case "repeatcount":
        case "repeatCount": return target.getRepeatCount();
        case "replyto":
        case "replyTo": return target.getConfiguration().getReplyTo();
        case "runlogginglevel":
        case "runLoggingLevel": return target.getRunLoggingLevel();
        case "scheduledexecutorservice":
        case "scheduledExecutorService": return target.getScheduledExecutorService();
        case "scheduler": return target.getScheduler();
        case "schedulerproperties":
        case "schedulerProperties": return target.getSchedulerProperties();
        case "searchterm":
        case "searchTerm": return target.getSearchTerm();
        case "sendemptymessagewhenidle":
        case "sendEmptyMessageWhenIdle": return target.isSendEmptyMessageWhenIdle();
        case "session": return target.getConfiguration().getSession();
        case "skipfailedmessage":
        case "skipFailedMessage": return target.getConfiguration().isSkipFailedMessage();
        case "sortterm":
        case "sortTerm": return target.getSortTerm();
        case "sslcontextparameters":
        case "sslContextParameters": return target.getConfiguration().getSslContextParameters();
        case "startscheduler":
        case "startScheduler": return target.isStartScheduler();
        case "subject": return target.getConfiguration().getSubject();
        case "timeunit":
        case "timeUnit": return target.getTimeUnit();
        case "to": return target.getConfiguration().getTo();
        case "unseen": return target.getConfiguration().isUnseen();
        case "usefixeddelay":
        case "useFixedDelay": return target.isUseFixedDelay();
        case "useinlineattachments":
        case "useInlineAttachments": return target.getConfiguration().isUseInlineAttachments();
        case "username": return target.getConfiguration().getUsername();
        default: return null;
        }
    }

    @Override
    public Object getCollectionValueType(Object target, String name, boolean ignoreCase) {
        switch (ignoreCase ? name.toLowerCase() : name) {
        case "schedulerproperties":
        case "schedulerProperties": return java.lang.Object.class;
        default: return null;
        }
    }
}

