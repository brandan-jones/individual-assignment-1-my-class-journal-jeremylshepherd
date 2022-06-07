package edu.uc.cech.soit.myclassjournal.service;

import edu.uc.cech.soit.myclassjournal.dto.JournalEntry;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class JournalService implements IJournalService {
    private final ArrayList<JournalEntry> journalEntries = new ArrayList<>();
    /**
     * Save a new Journal Entry
     *
     * @param journalEntry the entry to save.
     */
    @Override
    public void save(JournalEntry journalEntry) {
        journalEntries.add(journalEntry);
    }

    /**
     * Return all journal entries.
     *
     * @return a collection of all journal entries.
     */
    @Override
    public List<JournalEntry> fetchAll() {
        return journalEntries;
    }
}
