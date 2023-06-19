package com.ecews.mqlamisplus.config;

import org.springframework.amqp.core.AmqpTemplate;
import org.springframework.amqp.core.Queue;
import org.springframework.amqp.rabbit.connection.ConnectionFactory;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.amqp.support.converter.Jackson2JsonMessageConverter;
import org.springframework.amqp.support.converter.MessageConverter;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;


@Configuration
public class MessagingConfig {


    public static final String PATIENTQUEUE ="patient_queue";

    public static final String PATIENTVISIT ="visit_queue";

    public static final String BIOMETRICQUEUE ="biometric_queue";
    public static final String ARTPHARMACYQUEUE = "art_pharmacy_queue" ;
    public static final String HIVDRUGQUEUE = "hiv_drug_queue";
    public static final String VITALSIGNQUEUE = "vitalsign_queue";
    public static final String HIVENROLLMENTQUEUE = "hivenrollment_queue";

    public static final String HIVARTCLINICALQUEUE = "hiv_art_clinical_queue";

    public static final String HIVEACQUEUE = "hiv_eac_queue";

    public static final String EACOUTCOMEQUEUE = "eac_out_come_queue";

    public static final String HIVEACSESSIONQUEUE = "hiv_eac_session_queue";

    public static final String OBSERVATIONQUEUE = "observation_queue";

    public static final String HIVSTATUSTRACKERQUEUE = "hiv_status_tracker_queue";
    public static final String PATIENTTRACKERQUEUE = "patient_tracker_queue";

    public static final String INDEXELICITATIONQUEUE = "index_elicitation_queue";


    public static final String HTSCLIENTQUEUE = "hts_client_queue";


    @Bean
    public MessageConverter messageConverter(){

        return new Jackson2JsonMessageConverter();
    }


    @Bean
    public Queue queue(){

        return new Queue(PATIENTQUEUE);
    }

    @Bean
    public AmqpTemplate template(ConnectionFactory connectionFactory){

        final RabbitTemplate rabbitTemplate = new RabbitTemplate(connectionFactory);
        rabbitTemplate.setMessageConverter(messageConverter());
        return rabbitTemplate;
    }
}
