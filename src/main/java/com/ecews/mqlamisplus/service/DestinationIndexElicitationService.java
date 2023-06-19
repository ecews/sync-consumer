package com.ecews.mqlamisplus.service;


import com.ecews.mqlamisplus.models.hts.DestinationIndexElicitation;
import com.ecews.mqlamisplus.models.hts.IndexElicitation;
import com.ecews.mqlamisplus.repository.DestinationIndexElicitationRepo;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DestinationIndexElicitationService {

    @Autowired
    DestinationIndexElicitationRepo destinationIndexElicitationRepo;

    public DestinationIndexElicitation convertToDestinationIndexElicitationService(IndexElicitation indexElicitation) {



                DestinationIndexElicitation destination = new DestinationIndexElicitation();
                try {
                    // Copy properties from source to destination

                    BeanUtils.copyProperties(destination, indexElicitation);
                } catch (Exception e) {

                    // Handle any exceptions that occur during property copying
                    e.printStackTrace();
                }
                return destination;
            }

}
