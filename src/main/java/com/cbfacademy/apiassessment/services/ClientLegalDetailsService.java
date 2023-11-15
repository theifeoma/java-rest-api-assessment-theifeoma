package com.cbfacademy.apiassessment.services;

import com.cbfacademy.apiassessment.dto.ClientDto;
import com.cbfacademy.apiassessment.dto.ClientLegalDetails;
import com.cbfacademy.apiassessment.dto.ClientTradeDetails;
import com.cbfacademy.apiassessment.repositories.ClientLegalDetailsRepository;
import com.cbfacademy.apiassessment.repositories.ClientTradeDetailsRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.io.IOException;
import java.util.List;
import java.util.NoSuchElementException;

@Service
public class ClientLegalDetailsService {

    private final ClientLegalDetailsRepository clientLegalDetailsRepository;
    private static final Logger log = LoggerFactory.getLogger(ClientLegalDetailsService.class);

    @Autowired
    public ClientLegalDetailsService(ClientLegalDetailsRepository clientLegalDetailsRepository){
        this.clientLegalDetailsRepository = clientLegalDetailsRepository;
    }

    public List<ClientLegalDetails> getAllClientLegalDetails() throws IOException {
        return clientLegalDetailsRepository.getAll();
    }

    public List<ClientLegalDetails> findClientsByClassification(String classification) throws IOException {
        List<ClientLegalDetails> clients = clientLegalDetailsRepository.findClientsByClassification(classification);

        if (clients.isEmpty()) {
            throw new NoSuchElementException("No clients found with classification: " + classification);
        }

        return clients;
    }

    public List<ClientLegalDetails> getAllClientsByStatus(String status) throws IOException {
        return clientLegalDetailsRepository.getByStatus(status);
    }

    public List<ClientLegalDetails> getAllClientsByRiskRating(String riskRating) throws IOException {
        return clientLegalDetailsRepository.getByRiskRating(riskRating);
    }
}
